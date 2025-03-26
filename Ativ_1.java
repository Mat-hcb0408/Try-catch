package try_catch;

import java.util.Scanner;

public class Ativ_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Insira o primeiro numero: ");
            Double num1= sc.nextDouble();
            System.out.println("Insira o segundo numero: ");
            Double num2=sc.nextDouble();
            Double division=num1/num2;
            System.out.println(num1+"/"+num2+"="+division);
        }catch (ArithmeticException e) {
            System.out.println("Entrada invalida!");
        }
        sc.close();
    }
}

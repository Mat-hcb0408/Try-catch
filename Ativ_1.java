package try_catch;

import java.util.Scanner;

public class Ativ_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Insira o primeiro numero: ");
            Integer num1= sc.nextInt();
            System.out.println("Insira o segundo numero: ");
            Integer num2=sc.nextInt();
            Integer division=num1/num2;
            System.out.println(num1+"/"+num2+"="+division);

        }catch (ArithmeticException e) {
            System.out.println("Entrada invalida!");
        }
        sc.close();
    }
}

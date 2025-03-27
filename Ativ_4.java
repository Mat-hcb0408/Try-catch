package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ativ_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Insira um numero:");
            Integer num1= sc.nextInt();
            System.out.println("Insira o segundo numero:");
            Integer num2=sc.nextInt();
            Integer sum=num1+num2;
            System.out.println(num1+"+"+num2+"="+sum);
        }catch (InputMismatchException e){
            System.out.println("Entrada inválida");
        }
    }
}

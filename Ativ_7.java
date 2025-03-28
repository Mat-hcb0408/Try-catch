package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ativ_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("----------------------Calculadora de Média de Notas----------------------");
            System.out.print("Insira a 1ª nota: ");
            Double n1= sc.nextDouble();
            System.out.print("Insira a 2ª nota: ");
            Double n2= sc.nextDouble();
            System.out.print("Insira a 3ª nota: ");
            Double n3= sc.nextDouble();
            Double media=(n1+n2+n3)/3;
            System.out.printf("Média: %.2f",media);
        }catch (InputMismatchException e){
            System.out.println("Valor inválido!");
        }finally {
            sc.close();
        }
    }
}

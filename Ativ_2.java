package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ativ_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("pense em um numero: ");
            String num=sc.next();
            Integer.parseInt(num);
            System.out.println("O numero que você pensou foi "+num);
        }catch (NumberFormatException e){
            System.out.println("Entrada inválida!");
        }
        sc.close();
    }
}

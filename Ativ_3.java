package try_catch;

import java.util.Scanner;

public class Ativ_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.printf("Insira um numero %n √");
            Integer num=sc.nextInt();
            if (num<0){
                throw new IllegalArgumentException("Entrada inválida");
            }
            Double raiz=Math.sqrt(num);
            System.out.print("="+raiz);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}

package try_catch;

import java.util.Scanner;

public class Ativ_8 {

    //exceção personalizada IdadeInvalidaException
    public static class IdadeInvalidaException extends Exception{
        public IdadeInvalidaException(String messageAge) {
            super(messageAge);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Insira sua idade: ");
            Integer age=sc.nextInt();

            if (age<0){
                throw new IdadeInvalidaException("Idade inválida!");
            }

            String verification=(age>18)?"Maior de idade!":"Menor de idade!";
            System.out.println(verification);

        }catch (IdadeInvalidaException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}

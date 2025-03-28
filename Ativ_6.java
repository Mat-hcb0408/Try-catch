package try_catch;

import java.util.Scanner;

public class Ativ_6 {

    //exceção personalizada DadosInvalidosException
    public static class DadosInvalidosException extends Exception{
        public DadosInvalidosException(String messageData) {
            super(messageData);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Insira o nome do usuário: ");
            String user=sc.nextLine().trim();
            System.out.print("Insira a idade do usuário: ");
            Integer age=sc.nextInt();

            if (user.isEmpty()){
                throw new DadosInvalidosException("Dados inválidos!");
            }
            if (age<0){
                throw new DadosInvalidosException("Dados inválidos!");
            }

            System.out.printf("Usuário: %s %nIdade:   %d",user,age);

        }catch (DadosInvalidosException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}

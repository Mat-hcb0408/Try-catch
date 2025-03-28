package try_catch;

import java.util.Scanner;

public class Ativ_10 {

    //classe para chamada recursiva
    public static long factorial(int n ) {
        if (n != 0) {
            return n * factorial(n - 1);
        }else{
            return 1;
        }
}
    //exceção personalizada NumeroNegativoException
    public static class NumeroNegativoException extends Exception{
        public NumeroNegativoException(String messageNegative) {
            super(messageNegative);
        }
    }
    //exceção personalizada LimiteFatorialExcedidoException
    public static class LimiteFatorialExcedidoException extends Exception{
        public LimiteFatorialExcedidoException(String messageLimit) {
            super(messageLimit);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("-------------------Calculadora de Fatorial-------------------");
            try {
                System.out.print("Insira um número: ");
                Integer num=sc.nextInt();

                if (num<0){
                    throw new NumeroNegativoException("Entrada inválida!");
                }
                if (num>20){
                    throw new LimiteFatorialExcedidoException("Entrada excedida!");
                }

                long result = factorial(num);
                System.out.println(num+"! ="+result);
            }catch (NumeroNegativoException e){
                System.out.println(e.getMessage());
            }catch (LimiteFatorialExcedidoException e){
                System.out.println(e.getMessage());
            }finally {
                sc.close();
            }
    }
}

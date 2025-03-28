package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ativ_9 {

    //exceção personalizada TemperaturaInvalidaException
    public static class TemperaturaInvalidaException extends Exception{
        public TemperaturaInvalidaException(String messageTemp) {
            super(messageTemp);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("------------------Conversão de Temperatura------------------");
        try {
            System.out.println("Insira a temperatura (C): ");
            Double tempC=sc.nextDouble();

            if (tempC<-273.15){
                throw new TemperaturaInvalidaException("Temperatura inválida!");
            }


            Double TempF=(tempC*1.8)+32;
            System.out.println(TempF+" °F");
        }catch (TemperaturaInvalidaException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Insira um valor válido.");
        }finally {
            sc.close();
        }
    }
}

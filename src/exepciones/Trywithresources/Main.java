package exepciones.Trywithresources;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            Demo.verificarEdad(-4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            Demo.start();
        } catch (IOException e) {
            System.out.println("Ocurrió un error: " +   e.getMessage()); // Esto si lo verá el usuario.
        }

        try {
            Demo.exceptionPersonalizada(-50);
        } catch (Throwable e) {
            System.out.println("Ocurrió un error: " +   e.getMessage()); // Esto si lo verá el usuario.
        }



    }
}

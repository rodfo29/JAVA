package exepciones.cadenaExcepciones;



import java.io.IOException;

public class Main {
    public static void main(String[] args){


        try {
            Demo.start();
        } catch (Throwable e) {
            e.printStackTrace();
            e.getCause();
//            System.out.println("Ocurrió un error: " +   e.getMessage()); // Esto si lo verá el usuario.
        }




    }
}

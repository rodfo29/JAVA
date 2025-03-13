package exepciones.Trywithresources;


import exepciones.EdadInvalidaException;
import jdk.jshell.spi.ExecutionControlProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

    public static void suma(){
        sumando(null);
    }


    public static Integer sumando(Integer num){
        return num+2;
    }

    public static int noComprobado(){
        int numerador=10;
        int denominador=0;

        try
        {
            int resultado=numerador/denominador;
            System.out.println("Resultado: "    +   resultado);
            return resultado;

        }   catch (RuntimeException e)
        { // La ArithmeticExeption es una exepción no comprobada. por lo que esta hereda de RuntimeExeption.
            System.out.println(e.getMessage());
            System.out.println("mano estas mal llave");
            e.printStackTrace();
            return -1;


        }



    }

    public static void comprobado(){
        try (
                FileReader fr=new FileReader("archivo-inexistente.txt");
                FileReader fr2=new FileReader("archivo-inexistente2.txt");
                // los recursos se cerrarán automáticamente

        )
         {
            var data=fr.read();
        }


        catch (FileNotFoundException e){ // También podemos usar Exeption. // Es importante saber ordenar las exepciones, pera poder trabajar con casos específicos y no abarcar otros casos sin querer.
            System.out.println("Archivo no existe");
            e.printStackTrace();
        }


        catch (IOException | ArithmeticException e) { // También podemos condicionar distintas exepciones.
            System.out.println("No puedo leer el archivo.");
        }

        System.out.println("Aplicación continúa...");


    }

    public static void verificarEdad(int edad)   throws IOException  { // Si queremos lanzar una exeption comprobada debemos indicar el tipo de exeption que vamos a mandar.


        if (edad<0){
//            throw new IllegalArgumentException("La edad debe ser positiva."); // Lanzamos una exeption.
        }

        // Solo usamos el try catch si la exeption que estamos lanzando manualmente es comprobada.
        System.out.println("hola mundo...");
    }

    public static void start() throws IOException{

        try {
            verificarEdad(-1);
        } catch (IOException e) {
            System.out.println("Error verificando edad...."); // Esto forma parte de los logs que nos ayudarán a ver los problemas. (Esto no lo verá el usuario).
            throw e;
        }

    }
    public static void exceptionPersonalizada(int edad) throws EdadInvalidaException
    {

        if (edad<0){
            throw new EdadInvalidaException("La edad debe ser positiva."); // Lanzamos una exeption.
        }

        // Solo usamos el try catch si la exeption que estamos lanzando manualmente es comprobada.
        System.out.println("hola mundo...");
    }
}

package exepciones;

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
        FileReader fr=null;
        try {
            fr=new FileReader("archivo-inexistente.txt"); // Siempre debemos cerrar el file Reader.
            var data=fr.read();
        }

        catch (FileNotFoundException e){ // También podemos usar Exeption. // Es importante saber ordenar las exepciones, pera poder trabajar con casos específicos y no abarcar otros casos sin querer.
            System.out.println("Archivo no existe");
            e.printStackTrace();

            }

         catch (IOException | ArithmeticException e) { // También podemos condicionar distintas exepciones.
             System.out.println("No puedo leer el archivo.");
        }
        finally {
            // Por ejemplo si nos da error la línea del método read(), no podríamos cerrar el reader, por lo que al usar el finally nos aseguramos que siempre se ejecutará este bloque de código.
                try {
                    if (fr!=null){
                        fr.close(); // Usamos otro try-catch ya que puede ocurrir un error a la hora de cerrar el archivo.
                    }
                 }
                catch (IOException e) {
                    System.out.println("Error al cerrar");
                }


        }

        System.out.println("Aplicación continúa...");

    }
}

package poo.Ejercicios.ejercicio2;
import poo.Ejercicios.ejercicio2.VideoGame;

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
//        scanner.useLocale(Locale.US); // Podemos usar esta Clase Locale para indicar que formato queremos a la hora de escribir los números.

        System.out.print("Ingresar nombre del juego: ");
        String name=scanner.nextLine();
        System.out.print("Ingresar precio del juego: ");
        float price=0.0f;

        if (scanner.hasNextFloat()){ // Validamos que tenga un float
            price=scanner.nextFloat();
        }else{
            System.out.println("el numero ingresado no es correcto");
        }

        scanner.nextLine(); // Tomamos el salto de línea que dejan antes de usar nuevamente una cadena. tipo lo que pasa con fgets y getchar().

        System.out.print("Ingresar categoria del juego: ");
        String category=scanner.nextLine();
        VideoGame juego1=new VideoGame(name,price,category);

        System.out.println("nombre: " + juego1.getName());
        System.out.println("precio : " + juego1.getPrice());
        System.out.println("categoria: " + juego1.getCategory());

        juego1.setCategory("deportes");
        juego1.setCategory("action");

        System.out.println("\n\nNueva categoria: " + juego1.getCategory());

    }


}

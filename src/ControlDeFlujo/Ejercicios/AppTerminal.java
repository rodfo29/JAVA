package ControlDeFlujo.Ejercicios;

import java.util.Scanner;

public class AppTerminal {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String input="";
        // Se termina el bucle cuando efectivamente "equals" devuelva True y el operador " ! " lo cambie a falso lo que provocará la salida del bucle.
        while(!input.equals("salir")){
            // Es mejor usar equals en vez de comparar directamente los strings de esa manera: " String1 == String2" ya que compara referencias referencias de objetos, no los contenidos de las cadenas.
            System.out.println("Hola te gustaría seguir en la terminal? ");
            input=scanner.nextLine().toLowerCase(); // Tomamos el input y además lo Transformamos en minúsculas.
        }
        System.out.println("Salise del bucle ");
    }
}

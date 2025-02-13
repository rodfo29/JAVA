package TiposBasicos;

import java.util.Scanner;

public class ClassScanner {
    public static void main(String[] args){

        /*
        *nextInt(): Lee un entero.
        nextDouble(): Lee un número de punto flotante.
        nextLine(): Lee una línea completa de texto.
        next(): Lee la siguiente palabra.
        *
        * Texto (línea completa): sc.nextLine()
        Palabra (hasta un espacio): sc.next()
        Entero: sc.nextInt()
        Decimal: sc.nextDouble()
        Booleano: sc.nextBoolean()
        * */


        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine(); // Lee una línea completa

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt(); // Lee un entero

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        sc.close(); // Cerrar el scanner cuando ya no se necesite


        /*Evitar errores al mezclar nextLine() con nextInt():
        Después de usar nextInt(), si planeas usar nextLine(), agrégale un sc.nextLine(); extra para consumir el salto de línea.

        EJ:
        int edad = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        String nombre = sc.nextLine();
        Verificar la entrada antes de leerla:
        === VERIFICAR LAS ENTRADAS ANTES DE LEERLA  ===
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
            } else {
                System.out.println("No ingresaste un número válido.");
            }
        */
    }
}

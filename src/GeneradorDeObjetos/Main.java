package GeneradorDeObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String name;
        int edad;

        for (int i=0;i<2;i++){
            System.out.print("Ingresar nombre de la persona " + (Persona.getCantPersonas() + 1) + ": ");
            name=scanner.nextLine();
            System.out.print("Ingresar edad de la persona " + (Persona.getCantPersonas() + 1) + ": ");
            edad=scanner.nextInt();


            Persona.crearPersona(name,edad);
            scanner.nextLine(); // Tomamos el salto de línea que deja el entero
        }

        Persona.infoPersonas();

        scanner.close();



    }



}

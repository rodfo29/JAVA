package ControlDeFlujo;

import java.util.Scanner;

public class BreakAndContinue
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        String input="";
        while(true)
        {
            // Es mejor usar equals en vez de comparar directamente los strings de esa manera: " String1 == String2" ya que compara referencias referencias de objetos, no los contenidos de las cadenas.
            System.out.println("Hola te gustaría seguir en la terminal? ");
            input=scanner.nextLine().toLowerCase(); // Tomamos el input y además lo Transformamos en minúsculas.

            if (input.equals("salir"))
            {
                break;
            } else if (input.equals("gay"))
                    {
                        System.out.println("a ti te omitimos maricon");
                        continue; // Cuando llegamos a la condición del continue, se ejecuta este bloque de código y de una vez vamos a la siguiente iteracion.

                    }
            System.out.println(input);

        }
    }

}

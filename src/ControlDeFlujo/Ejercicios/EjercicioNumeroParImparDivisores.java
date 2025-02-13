package ControlDeFlujo.Ejercicios;

import java.util.Scanner;

public class EjercicioNumeroParImparDivisores {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingresar numero: ");
        int numero=scanner.nextInt();

        String tipoDeNumero= (numero%2==0)?"par":"impar";
        System.out.println(tipoDeNumero);
         // Validamos si el número es divisible tanto por 3 como por 4
        boolean divisiblePor3= (numero%3==0);
        boolean divisiblePor4= (numero%4==0); // Literalmente los booleanos no sirven para evaluar si algo o algunas situaciones suceden

        if (divisiblePor3 && divisiblePor4)
        {
            System.out.println("el numero es divisible por 3 y 4");
        }   else if (divisiblePor3)
            {
                System.out.println("divisible por 3");

            }   else if (divisiblePor4)
            {
                System.out.println("divisible por 4");
            }

    }
}

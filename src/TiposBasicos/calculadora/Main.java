package TiposBasicos.calculadora;
// La ruta es realmente= src/TiposBasicos/Calculadora
import TiposBasicos.calculadora.Calculadora;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingresar numero 1: ");
        int valorA= scanner.nextInt();
        System.out.print("Ingresar numero 2: ");
        int valorB= scanner.nextInt();
        System.out.println("El resultado es: "+Calculadora.suma(valorA,valorB));
    }
}

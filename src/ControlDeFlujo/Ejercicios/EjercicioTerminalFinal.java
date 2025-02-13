package ControlDeFlujo.Ejercicios;
import TiposBasicos.calculadora.Calculadora;

import java.util.Scanner;

public class EjercicioTerminalFinal {
    public static void MenuCalculadora(){
        Scanner scanner= new Scanner(System.in);
        int input=0;
        int num1;
        int num2;
        int NumOperacion=1;
        System.out.println("\n\n\n===== Bienvenido a la calculadora ======");
        while(input!=5)

        {
            System.out.println("\n\n ===== OPERACION Nº "+ NumOperacion + " ====\n");
            NumOperacion++;
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicación");
            System.out.println("4- División");
            System.out.println("5- Salir");
            System.out.print("ingresar opción : ");
            input=scanner.nextInt();

            switch (input)
            {
                     case 1:
                        System.out.println("Ingresar numero 1: ");
                        num1=scanner.nextInt();
                        System.out.println("Ingresar numero 2: ");
                        num2=scanner.nextInt();
                        System.out.println("Resultado: " + Calculadora.suma(num1,num2));
                        break;
                     case 2:
                            System.out.println("Ingresar numero 1: ");
                            num1=scanner.nextInt();
                            System.out.println("Ingresar numero 2: ");
                            num2=scanner.nextInt();
                            System.out.println("Resultado: " + Calculadora.resta(num1,num2));
                            break;

                     case 3:
                         System.out.println("Ingresar numero 1: ");
                         num1=scanner.nextInt();
                         System.out.println("Ingresar numero 2: ");
                         num2=scanner.nextInt();
                         System.out.println("Resultado: " + Calculadora.multiplicacion(num1,num2));
                         break;
                     case 4:
                         System.out.println("Ingresar numero 1: ");
                         num1=scanner.nextInt();
                         System.out.println("Ingresar numero 2: ");
                         num2=scanner.nextInt();
                         float casteoNum1=(float)num1;
                         System.out.println("Resultado: " + Calculadora.division(casteoNum1,num2));
                         break;
                default:
                    input=5;
                    break;
            }

        }
        // Nos regresamos a la función anterior retornando desde esta función, ya que al llamar una función adentro de otra, la primera función queda pendiente, por lo que podemos regresar retornando.
        return;
    }

    // No podemos usar métodos estáticos adentro de otros métodos que si son estáticos

    /*  Los métodos estáticos (static) pertenecen a la clase, mientras que los métodos no estáticos pertenecen a una instancia de la clase.
💡   Los métodos estáticos NO pueden acceder directamente a métodos no estáticos porque no hay una instancia de la clase para usarlos.
    */
    public static void nasa(){
        for (int i=0;i<5;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int input=0;
        Scanner scanner= new Scanner(System.in);
        while(input!=3){
            System.out.println("1- Calculadora");
            System.out.println("2- Hackear la nasa ");
            System.out.println("3- Salir");
            System.out.print("Ingresar opción: ");
            input=scanner.nextInt();

            switch (input)
            {   // < --------|
                //           |
                case 1: MenuCalculadora();break;
                case 2: System.out.println("Estamos hackeando la  nasa...");nasa();break;
                case 3 : input=3;break;
                default: System.out.println("Hermano ingresa una opción válida");break;
            }
        }
    }
}

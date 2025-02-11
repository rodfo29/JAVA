package TiposBasicos;

import java.util.Arrays;// Con esta clase podemos hacer uso de

public class Array
{
    public static void main(String[] args)
    {
        int[] numeros=new int[5]; // De esta manera declaramos los arreglos de forma estática, debemos indicar la cantidad de elementos que queremos almacenar.
        int[] arrayInicializado={1,2,3,4,5}; // De esta manera podemos nosotros inicializar el array con elementos.
        System.out.println("Arrays");
        for (int i = 0; i < 5; i++)
        {
            numeros[i]=10;
        }

        System.out.println(Arrays.toString(numeros)); // Con este método podemos mostrar por consola nuestro arreglo sin necesidad de iterarlo
        System.out.println(numeros.length);
        System.out.println(Arrays.toString(arrayInicializado));

    }
}

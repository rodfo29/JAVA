package TiposBasicos;

import java.util.Arrays;

public class ArreglosMultidimensionales {
    public static void main(String[] args){
        int[][] matriz={{1,2,3},{4,5,6},{7,8,9}}; // De esta manera declaramos y definimos una matriz
        int [][]matriz2=new int[5][5]; // Así los dejamos declarados en memoria.
        System.out.println((Arrays.deepToString(matriz))); // Con este método podemos mostrar por pantalla todo el arreglo
        System.out.println((Arrays.deepToString(matriz2)));

    }
}

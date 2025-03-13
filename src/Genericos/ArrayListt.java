package Genericos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListt {
    public static void main(String[] args){




        ArrayList<Integer> numeros=new ArrayList<Integer>();

        // Podemos hacer que el array tenga valores iniciales.
        String[] numerosEnString=new String[]{"1","2"};
        ArrayList<String> arregloStrings=new ArrayList<String>();
        arregloStrings.addAll(Arrays.asList(numerosEnString));

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        int primero=numeros.getFirst();
        int ultimo=numeros.getLast();


        // Usamos el forEach para iterar el arraylist.
        for (Integer numero:numeros){
            System.out.println(numero);
        }

        // For normal
        System.out.println("For normal: ");
        for(int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i)); // Obtenemos los elementos con el índice mediante el uso de objeto.get(indice).
        }

        System.out.println(numeros);
        System.out.println(primero);
        System.out.println(ultimo);

        System.out.println(arregloStrings);

    }
}

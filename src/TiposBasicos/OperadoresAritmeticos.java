package TiposBasicos;

public class OperadoresAritmeticos {
    public static void main(String[] args){
        int suma=1+3;
        int resta=1-3;
        int multiplicacion=1*3;
       double division=10f/3f;
       float division2=10f/3f;
       int x=5; // Variable que espera el operador de aumento posteriomente
       int y=5; // Variable que espera el operador de aumento anteriormente
        int z=x++; // Se asigna el valor y luego se incrementa la variable
        System.out.println(z);
        System.out.println(x++);
        System.out.println(x);


        System.out.println(++y); // Aumenta el valor de la variable y luego se usa el valor almacenado

        System.out.println(division);
        System.out.println(resta);

    }
}

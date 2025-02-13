package TiposBasicos.calculadora;

public class Calculadora {
    public static int suma(int a,int b){
        return a+b;
    }
    public static int multiplicacion(int a,int b){
        return a*b;
    }

    public static float division(float a,int b){
        if (b!=0){
            return a/b;
        }
        System.out.println("Operación no válida. No se puede dividir entre 0");
        return b;
    }
    public static int resta(int a,int b){
        return a-b;
    }


}


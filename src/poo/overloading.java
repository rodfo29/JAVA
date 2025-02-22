package poo;

public class overloading {

    public static int suma(int a, int b){
        return a+b;
    }
    // El overloading es poder definir el método múltiples veces pero pudiendo cambiar el número de argumentos o el tipo de argumentos
    public static int suma(int a,int b,int c){
        return a+b+c;
    }
    public static void arreglo(int[] numeros){
        for(int numero :numeros){
            System.out.print(numero+" ");
        }
    }

    public static void main(String[] args){
        int resultado=suma(15,20);
        int resultado2=suma(15,20,3);
        int[] numeros3={25,30,54,65,72,89,94};
        // 2da forma de poder usar el método del arreglo pero declarandolo directamente como argumento
        arreglo(new int[] {12,13,14,15,16,17,18,19,20});
        arreglo(numeros3);
        System.out.println(resultado2);
    }
}

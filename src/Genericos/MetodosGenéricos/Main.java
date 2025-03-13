package Genericos.MetodosGenéricos;

public class Main {
    public static void main(String[] args){
        System.out.println(Utils.max(1.5,2.3));; // Los tipos ingresados deben ser los mismos. Ej = No podemos (1, 2.3) -> < (INT, DOUBLE) ---> (2,3) --> (int,int) aceptado.
        System.out.println(Utils.multi(1,2.2));

    }
}

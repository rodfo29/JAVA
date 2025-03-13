package Genericos.CompareTo;

public class Main {
    public static void main(String[] args){
        Persona persona1=new Persona("Martin",20);
        Persona persona2=new Persona("Alejandro",19);
        System.out.println(persona2.compareTo(persona1)); // Retorna + si el objeto que lo ejecuta el método es mayor.
    }
}

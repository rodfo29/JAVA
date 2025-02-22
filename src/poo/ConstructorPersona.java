package poo;

public class ConstructorPersona {
    String name;
    int age;

    // El constructor debe tener el mismo nombre que la clase, antes de usar las propiedades en el constructor las debemos declarar.
    public ConstructorPersona(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args){
        // Hacemos uso del constructor.
        ConstructorPersona persona1= new ConstructorPersona("martin",28);
        System.out.println(persona1.name);
    }
}

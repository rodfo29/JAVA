package poo;

public class ConstructorOverloading {
    public String name;
    public int edad;
    public String email;


    public ConstructorOverloading(String name){
        this.name=name;
    }
    // También podemos hacer overloading al constructor. Esto nos puede servir para por ejemplo:
    // el usuario tiene otro campo que sea opcional registrar como: segundo nombre etc.
    public ConstructorOverloading(String name,String email){
        this.name=name;
        this.email=email;
    }
    public  static void main(String[] args){
        ConstructorOverloading user1= new ConstructorOverloading("martin");
        ConstructorOverloading user2= new ConstructorOverloading("martin","martinpinto.2812@gmail.com");



    }



}

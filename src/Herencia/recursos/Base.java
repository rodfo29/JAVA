package Herencia.recursos;

public class Base {
    private String name;

    // Se ejecutará primero el constructor del padre antes que el de las clases hijas.
    public Base(String name){
        this.name=name;
        System.out.println("Soy base");
    }
    public String getName(){
        return  this.name;
    }

    public void setName(String newName)
    {
        this.name=newName;
    }

    public void saludar(){
        System.out.println("hola niño");
    }

    public String ejemploSuperSuperClase(){
        return "MARTIN ALEJANDRO PINTO GUILARTE";
    }
}

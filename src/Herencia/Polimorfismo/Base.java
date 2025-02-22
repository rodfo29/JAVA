package Herencia.Polimorfismo;

public abstract class Base {
    private String name;
    private float price;

    public Base(String name,float price){
        this.name=name;
        this.price=price;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name=newName;
    }


    public float  getPrice(){
        return  this.price;
    }

    public void setPrice(float newPrice){
        this.price=newPrice;
    }

    public abstract void guardar();
        // SOLO NOS INTERESA CÓMO SE IMPLEMENTA EN LAS CLASES PRODUCTO Y CATEGORIA






}

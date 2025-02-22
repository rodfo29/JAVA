package Herencia.Polimorfismo;


public class Categoria extends Base {
    public Categoria(String name,float price){
        super(name,price);
    }
    @Override
    public void guardar(){
        System.out.println("Guardando Categoria =  " + this.getName() + "...");
    }

}

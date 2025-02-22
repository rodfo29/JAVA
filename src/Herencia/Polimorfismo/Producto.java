package Herencia.Polimorfismo;

public class Producto extends Base{
    private int fechaCaducidad;
    public Producto(String name,float price,int fechaCaducidad){
        super(name,price);
        this.fechaCaducidad=fechaCaducidad;
    }

    @Override
    public void guardar(){
        System.out.println("Guardando Producto = " + this.getName() + "...");
    }

    public int getFechaCaducidad(){
        return this.fechaCaducidad;
    }
}

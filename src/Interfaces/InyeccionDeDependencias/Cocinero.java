package Interfaces.InyeccionDeDependencias;
// Permiso de: Atender mesa y Preparar Comida.
public class Cocinero extends Empleado implements IAtenderMesa,ICocinar{

    public Cocinero(String name, int sueldo){
        super(name,sueldo);
    }


    @Override
    public void atenderMesa(){
        System.out.println("Cocinero: " +   this.getName()  +   " Atendiendo mesa...");
    }

    @Override
    public void cocinar(){
        System.out.println(this.getName()   +   " Cocinando...");
    }

}

package Interfaces.InyeccionDeDependencias;
// Permiso de: Atender mesa.
public class Mesonero  extends Empleado implements IAtenderMesa{


    public Mesonero(String name,int sueldo){
        super(name,sueldo);
    }


    @Override
    public void atenderMesa(){
        System.out.println(this.getName()    +   " Atendiendo mesa...");
    }



}

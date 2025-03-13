package Interfaces.InyeccionDeDependencias;
// Permiso de:  Atender mesas.
public class Cajero extends Empleado implements IAtenderMesa {



    public Cajero(String name,int sueldo){
        super(name,sueldo);
    }


    @Override
    public void atenderMesa(){
        System.out.println("Cajero : "    +   this.getName()   +    " Atendiendo a la mesa....");
    }



}

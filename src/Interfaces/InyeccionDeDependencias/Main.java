package Interfaces.InyeccionDeDependencias;

public class Main {
    public static void main(String[] args){

        // Atender mesas.
        Cajero cajero1=new Cajero("Martín Pinto",1500);
        Mesonero mesonero1=new Mesonero("Jose",200);
        Mesonero mesonero2=new Mesonero("Alberto",400);


        // Atender mesas y cocinar
        Cocinero cocinero1= new Cocinero("Martín Pinto", 3000);


        // Empleados del restaurante
        Empleado[] empleados={cajero1,mesonero1,mesonero2,cocinero1};
        // Intancias que pueden Atender mesas.
        IAtenderMesa[]  atendedoresMesa={cajero1,mesonero1,mesonero2,cocinero1};


        // Instancias que pueden Preparar Comida.
        ICocinar[] atendedoresCocina={cocinero1};



        Restaurante restaurantAuraBurguer= new Restaurante(empleados,atendedoresMesa,atendedoresCocina);



        // Ordena Preparar la comida a los empleados capaces de Cocinar.
        restaurantAuraBurguer.prepararComida(atendedoresCocina);

        // Ordena Atender Mesas a los Empleados Capaces de Atender mesas.
        restaurantAuraBurguer.atenderMesa(atendedoresMesa);



        // Información General de los Empleados.
        restaurantAuraBurguer.infoEmpleados();

    }
}

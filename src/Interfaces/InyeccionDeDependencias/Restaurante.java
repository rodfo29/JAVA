package Interfaces.InyeccionDeDependencias;

public class Restaurante {

    private Empleado[] empleados;
    private ICocinar[] encargadosCocina;
    private IAtenderMesa[] encargadosMesa;



    // Inyección por constructor
    public Restaurante(Empleado[] empleados,IAtenderMesa[] encargadosMesa,ICocinar[] encargadosCocina){
        this.encargadosMesa=encargadosMesa;
        this.encargadosCocina=encargadosCocina;
        this.empleados=empleados;
    }




    // Arreglo de interfaces capaces de atender mesas.
    public void atenderMesa(IAtenderMesa[]empleados){
        System.out.println("Atendiendo Mesa:");
        for (int i=0;i<empleados.length;i++){
            empleados[i].atenderMesa(); // Relacionamos a todos los empleados que puedan atender a la mesa.

        }

    }

    // Empleados capaces de poder acceder a la cocina.
    public void prepararComida(ICocinar[]empleados){
        System.out.println("Preparando Comida:");
        for (int i=0;i<empleados.length;i++){
            empleados[i].cocinar();
        }

    }

    // Información de los empleados del restaurante
    public void infoEncargadosMesa(){
        System.out.println("Inyección Por Constructor... \n");
        for (int i=0;i<this.encargadosMesa.length;i++){
            this.encargadosMesa[i].atenderMesa();
        }

    }

    // Usamos la inyección por el constructor
    public void infoEmpleados(){
        for (int i=0;i<this.empleados.length;i++){
            this.empleados[i].mostrarInfoEmpleado();
        }
    }


}

package Interfaces.InyeccionDeDependencias;


// Encargada de los datos personales de los Empleados. Los datos específicos de cada clase los trabajamos por separado.
public abstract class Empleado {
    private String name;
    private int salary;

    public Empleado(String name,int salary){
        this.name=name;
        this.salary=salary;
    }

    // Método general para todas las subclases.
    public void mostrarInfoEmpleado(){
        System.out.println("Nombre: "   +   this.name   +   "- salary: "    +   this.salary);
    }


    // Getters y Setters.
    public String getName(){
        return this.name;

    }


    public void setName(String newName){
        this.name=newName;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int newSalary){
        this.salary=newSalary;
    }

}

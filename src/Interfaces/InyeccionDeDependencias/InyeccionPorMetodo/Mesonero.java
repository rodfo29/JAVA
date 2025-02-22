package Interfaces.InyeccionDeDependencias.InyeccionPorMetodo;

public class Mesonero {
    private String name;
    private int accumulatedSalary;

    public Mesonero(String name, int accumulatedSalary){
        this.name=name;
        this.accumulatedSalary=accumulatedSalary;
    }

    public void atenderMesa(){
        System.out.println("Mesonero: " +   this.name   +   " atendiendo mesa...");
    }




}

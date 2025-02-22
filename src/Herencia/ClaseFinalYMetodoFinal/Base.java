package Herencia.ClaseFinalYMetodoFinal;

public abstract class Base {
    private String name;
    private int numHijos;


    public Base(String name, int numHijos){
        this.name=name;
        this.numHijos=numHijos;
    }



    // No se puede reescribir este método al ser final.
    public final   void saludar(){
        System.out.println("Saludo a todos.");
    }







}

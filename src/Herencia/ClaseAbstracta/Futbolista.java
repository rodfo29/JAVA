package Herencia.ClaseAbstracta;

public  abstract  class Futbolista {
    private String nombre;
    private int edad;

    public Futbolista(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public abstract void patear(); // Obligatoriamente las subclases debe declarar este método.
    public abstract void correr();  // Obligatoriamente las subclases debe declarar este método.




}

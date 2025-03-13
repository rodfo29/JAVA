package Herencia.ClaseAbstracta;

import Genericos.ArrayListt;
import Genericos.ClaseGenerica.Lista;

import java.util.ArrayList;


public  abstract  class Futbolista {
    private String nombre;
    private int edad;
    private Rareza rareza;
    private int fuerza;
    private int velocidad;
    private int disparo;

    private ArrayList<String> tecnicas=new ArrayList<>();





    public Futbolista(String nombre, int edad, int fuerza,int disparo,int velocidad,Rareza rareza){
        this.nombre=nombre;
        this.edad=edad;
        this.fuerza=fuerza;
        this.disparo=disparo;
        this.velocidad=velocidad;
        this.rareza=rareza;

    }

    public abstract Futbolista patear(); // Obligatoriamente las subclases debe declarar este método.
    public abstract Futbolista correr();  // Obligatoriamente las subclases debe declarar este método.

    // Método general que tendrán todas las subclases de futbolistas y los futbolistas creados a partir de esta clase.
    public Futbolista totalHabilidades(){

        int totalStats=this.fuerza  +   this.velocidad  +   this.disparo    +   this.rareza.getBonus();

        System.out.println("Fuerza: "   + this.fuerza   );
        System.out.println("Velocidad: "   +  this.velocidad  );
        System.out.println("Disparo: "   +   this.disparo  );
        System.out.println("Rareza: " + this.rareza.getNombreRareza());
        System.out.println("Total: "  +  totalStats);
        return this;

    }

    public Futbolista agregarHabilidad(String nuevaHabilidad){
            this.tecnicas.add(nuevaHabilidad);
            return this;
    }

    public Futbolista getHabilidades(){
        System.out.println("Habilidades disponibles: ");
        for(String habilidad:tecnicas){
            System.out.println(habilidad);
        }
        return this;

    }

}

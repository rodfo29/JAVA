package Herencia.ClaseFinalYMetodoFinal;

public class Nivel1 extends Base{
    public int nivel;
    public Nivel1(String name,int numHijos,int nivel){

        super("nivel1",20);
        this.nivel=nivel; // Este atributo no está incluido en el constuctor de la clase padre, debemos definirlos nosotros mismos.
    }


}

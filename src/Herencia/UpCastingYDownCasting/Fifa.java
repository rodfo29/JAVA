package Herencia.UpCastingYDownCasting;

public class Fifa extends Juego{
    public Fifa(String name, float price){
        super(name,price);
    }
    public void metodoSoloDeFifa(){
        System.out.println("Hola este método solo lo pueden ejecutar instancias de Fifa");
    }

    /*Imaginemos que se crean 2 objetos distintos pero queremos validar si son el mismo fifa por el nombre
    podemos hacerlo sobreescribiendo el método equals. Usamos la lógica de verficiar si es una instancia de
    Fifa y luego aplicamos un casteo a Fifa.

    Básicamente, sobreescribimos el método "equals" a nuestro gusto.
     */


    @Override
    public boolean equals(Object obj){ // Object = objeto universal
        if (obj instanceof Fifa){
            Fifa objFifa=(Fifa)obj;
            return  this.getName().equals(objFifa.getName()); // Objeto.nombre.equals(ObjetoFifa.nombre);
        }

        return false;
    }

}

package Genericos.ClaseGenerica;

public class Caja <T>{
    private T contenido;

    public Caja(T contenido){
        this.contenido=contenido;
    }


   public T getContenido(){
        return  this.contenido;
    }
}

package poo.Ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args){
        VideoGame juego1=new VideoGame("GTA VI",14.99f,"Action");
        VideoGame juego2=new VideoGame("EA SPORTS FC 25",79.99f,"SPORTS");
        System.out.println("nombre: " + juego2.getName());
        juego2.setName("MLB THE SHOW 2026");
        System.out.println("nombre: " + juego2.getName());
        System.out.println("El precio del juego es : " + juego1.getPrice() + "$");
    }
}

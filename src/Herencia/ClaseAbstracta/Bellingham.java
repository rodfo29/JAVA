package Herencia.ClaseAbstracta;

public class Bellingham extends Futbolista{
    public static final int numero=10; // Variable de clase.

    public Bellingham(String nombre,int edad,int fuerza,int disparo,int velocidad,Rareza rareza){

        super(nombre,edad,fuerza,disparo,velocidad,rareza);

    }



    @Override
    public Bellingham correr(){
        System.out.println("Corriendo hey jude...");
        return this;
    }

    @Override
    public Bellingham patear(){
        System.out.println("BELLIGOOOLLLLLLLLLLL BELLINGAMMMMMMMM BELLIIIIIIIIIIIIII ELI ILUMINADOOOOOOOOOOOOOO");
        return this;
    }



}

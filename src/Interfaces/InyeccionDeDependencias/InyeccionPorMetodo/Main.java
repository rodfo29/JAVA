package Interfaces.InyeccionDeDependencias.InyeccionPorMetodo;

public class Main {
    public static void main(String[] args){
        Mesonero mesonero=new Mesonero("Marco", 20);
        Mesonero mesonero2=new Mesonero("Alejandro", 100);
        Mesonero mesonero3=new Mesonero("Jose", 200);
        Mesonero[] mesoneros={mesonero,mesonero2,mesonero3};


        Restaurante.llevarCerveza(mesoneros);

    }
}

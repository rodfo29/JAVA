package Herencia.Polimorfismo;

public class Main {

    static void guardarRecursos(Base[] recursos){
        for(Base recurso:recursos){
            recurso.guardar();// únicamente se pueden usar los métodos atributos que relacionan a la subclase con la superclase/Ancestro.
        }
    }




    public static void main(String[]    args){
        Base[] recursos={new Categoria("DEPORTES",79.99f),new Producto("Pelota de tenis",8.99f,2025)};
        guardarRecursos(recursos);
        Base base=new Producto("PELOTA DE BASQUET",14.99f,2025);
        Producto base2=new Producto("PELOTA DE BASQUET",14.99f,2025);
        base2.getFechaCaducidad();


    }

}

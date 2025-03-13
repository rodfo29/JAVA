package Genericos.ClaseGenerica;

public class Main {
    public static void main(String[] args){
     Lista<Integer> lista= new Lista<>();

     lista.add(1);
     lista.add(2);

     lista
             .add(3)
             .add(5)
             .add(25); // Es util encadenar si los métodos devuelven siempre la instancia de la clase,
                       //  en caso de qur un método no devuelva la instancia de la clase, no puede seguir existiendo el encadenamiento.

     lista.add(4);
     Integer primero=lista.get(0);
        System.out.println(primero);
//    Caja<String> caja=new Caja<>("Martin");
//        System.out.println(caja.getContenido());
    }


}

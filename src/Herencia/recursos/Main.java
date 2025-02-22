package Herencia.recursos;

public class Main {
    public static void main(String[] args){
        // Ambas clases heredan los atributos y métodos de la clase Base
            Productos producto1=new Productos();
            Categorias categoria1= new Categorias();

            Base base=new Base("martin");

         // Comparar objetos
        System.out.println(categoria1.equals(categoria1));
        System.out.println(categoria1.equals(producto1));




        producto1.setName("Martin");

        System.out.println(producto1.getName());

    }
}

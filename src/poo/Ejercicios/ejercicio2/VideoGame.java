package poo.Ejercicios.ejercicio2;

import java.text.NumberFormat;
import java.util.Locale;

public class VideoGame {
    private static final String[] categories= {"action","rpg", "adventure","racing"};
    private String name;
    private String category;
    private float price;

    public VideoGame(String name,float price,String category){
        this.name=name;


        this.price=(price<10)?10:price; // Operador terneario. Si es menor a 10 el precio se fijará en 10
        this.category=category;

    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public String getPrice(){

        Locale locale= Locale.forLanguageTag("en-US"); // Definimos la localidad.
        NumberFormat numberFormat= NumberFormat.getCurrencyInstance(locale); // Pasamos la localización y luego nos retornará un formato con la moneda local automáticamente.
        String result=numberFormat.format(this.price); // Formateamos el precio del objeto.
        return result;
    }
    public void  setPrice(float newPrice){
        this.price=newPrice;
    }
    public String getCategory(){
        return this.category.toUpperCase() + ".";
    }

    public void setCategory(String newCategory){
        for(int i=0;i<categories.length;i++){
            if (categories[i].equals(newCategory)){
                System.out.println("Cambiando categoria....");
                System.out.println("Categoría cambiada con Éxito..");
                this.category=newCategory;
                return;
            }
        }
        System.out.println("La categoría ingresada no se encuentra disponible...");

    }

}

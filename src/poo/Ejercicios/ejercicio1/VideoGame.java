package poo.Ejercicios.ejercicio1;

public class VideoGame {
    private String name;
    private String category;
    private float price;

    public VideoGame(String name,float price,String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public float getPrice(){
        return this.price;
    }
    public void  setPrice(float newPrice){
        this.price=newPrice;
    }
    public String getCategory(){
        return this.category;
    }
    public void setCategory(String newCategory){
        this.category=newCategory;
    }

}

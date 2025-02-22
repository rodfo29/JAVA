package Herencia.UpCastingYDownCasting;

/*las clases que hereden de Juego, tendrán en común esta clase como ancestro.
Esto permitirá que un método/colletion pueda recibir toda una Familia de clases sin
problemas.
EJ:
    Animales[] animales= {new Perro(),new Gato(), new Vaca(), new Pajaro()};
En este ejemplo nos referimos a todo grupo de animales, lo que nos permite poder almacenarlos todos
ya que tienen de ancestro en común la clase animal.
 */

public class Juego {
    private String name;
    private float price;

    public Juego(String name,float price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return this.name;
    }
    public float getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(float newPrice){
        this.price=newPrice;
    }
}

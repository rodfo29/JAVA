package Herencia.ClaseAbstracta;

public class main {
    public static void main(String[] args){
//        Futbolista vinicius=new Vinicius();
        Futbolista bellingham=new Bellingham("Jude Bellingham",21,78,77,90,Rareza.ORO);
//        vinicius.correr();


        bellingham
                .correr()
                .patear()
                .totalHabilidades()
                .agregarHabilidad("Cabezazo de Fuego")
                .agregarHabilidad("Chilena Poderosa")
                .agregarHabilidad("Chilena Poderosa")
                .getHabilidades();


        System.out.println(Bellingham.numero);


    }
}

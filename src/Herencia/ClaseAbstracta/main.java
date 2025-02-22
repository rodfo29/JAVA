package Herencia.ClaseAbstracta;

public class main {
    public static void main(String[] args){
        Futbolista vinicius=new Vinicius();
        Futbolista bellingham=new Bellingham();
        vinicius.correr();
        bellingham.patear();
        System.out.println(Bellingham.numero);
    }
}

package Herencia.ClaseAbstracta;

public class Vinicius extends Futbolista{

    public Vinicius(){
        super("Viniciud de Oliveira Paixao",25); // Obligatoriamente, debemos definir por lo menos nosotros mismo el constructor de la superclase, aun así sea pasándole nosotros mismos los argumentos
    }
    public void correr(){
        System.out.println("corriendo como mono");
    }
    public void patear(){
        System.out.println("pateando al arco");
    }
}

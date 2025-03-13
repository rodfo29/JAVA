package Genericos.MultiplesTipos;

public class Main {

    public static void main(String[] args){
    Pairs<Integer,String> p=new Pairs<>(1,"Martin Pinto");
        System.out.println(p.getValue());
        System.out.println(p.getKey());

    }
}

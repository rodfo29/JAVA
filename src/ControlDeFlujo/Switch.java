package ControlDeFlujo;

public class Switch {
    public static void main(String[] args){
        String action="aregar";
        switch(action)
        {
            case "eliminar": System.out.println("estamos eliminando los recursos"); break;
            case "modificando": System.out.println("modificando el recurso");break;
            default: System.out.println("La opción no es reconocida");break;
        }

    }
}

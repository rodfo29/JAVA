package poo.GettersAndSetters;

import poo.GettersAndSetters.User;

public class Main {
    public static void main(String[] args){
        User user1=new User("Martín");
        user1.login();

        String password=user1.getPassword();

        System.out.println("La contraseña es: " + password);
        user1.setPassword("#####Pinto2812$#####");
        String password2=user1.getPassword();
        System.out.println("La nueva Contraseña es: " + password2);

    }
}

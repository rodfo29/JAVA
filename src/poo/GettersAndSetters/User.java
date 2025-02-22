package poo.GettersAndSetters;



// Con estos nos evitamos modificar sin querer propiedades que no deberíamos o también ocultar propiedades
// que no deberían ser públicas. Mediante el uso de estos getters y setters no accedemos a cosas a las cuales no
// Deberíamos acceder. Es como los meseros en los restaurantes con la cocina.

public class User {
    String name;

    private static String tableName="Usuarios";
    int id=31894388;
    private String password="Ñ♣◘♦◘jfosij3++´++`*^{ç+ç´/&$(/&%/%/&ifhsi/" ; // Solo podremos usar esta propiedad desde la clase.

    public User(String name){
        this.name=name;
    }




    private void validatePassword(){
        System.out.println("Validando Contraseña...");

    }
    public void login(){
        System.out.println("LLamando base de datos...");
        this.validatePassword();
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        System.out.println("Encriptando la clave...");
        String encryptedPassword= password; // Supongamos que la contraseña pasa por un método que la encripta.
        this.password=encryptedPassword;
    }

    // también podemos hacer overloading de la setter
    public void setPassword(String password,String encryptation){
        System.out.println("Encriptando contraseña con el método: " + encryptation);
        String encrypted=password;
        this.password=encrypted;

    }



}

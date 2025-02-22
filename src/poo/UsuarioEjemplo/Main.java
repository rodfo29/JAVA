package poo.UsuarioEjemplo;

public class Main {
    public static void main(String[] args){
        User user1=new User("Martín");
        user1.login();
        user1.editFiles();
        user1.permission.privilege="Watch Videos";
        user1.editFiles();



    }
}

package poo.UsuarioEjemplo;
// Esta clase es para seguir los ejemplosd de nicholas schurmann y aplicamos todo lo visto hasta ahora
public class User {
     String name;
     Permission permission;


    static String tableName="Usuarios";
     int id=31894388;
     private String password="Pinto2812$"; // Solo podremos usar esta propiedad desde la clase.

     public User(String name){
         this.name=name;
         this.permission=new Permission("Edit Files");

     }




     // Básicamente, queremos que haga un proceso de manera interna sin notificar al usuario
    // como validar la contraseña.
     private void validatePassword(){
         System.out.println("Validando Contraseña...");

     }
     public void login(){
         System.out.println("LLamando a base de datos...");
         this.validatePassword();
     }

    public void editFiles(){
         if (this.permission.privilege.equals("Edit Files")){
             System.out.println("Editando archivos del usuario");
         }else{
             System.out.println("El usuario no tiene los permisos necesarios para esta acción.");
         }
    }

}

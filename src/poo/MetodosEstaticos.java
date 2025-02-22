package poo;

public class MetodosEstaticos {
    static String Tabla="Tabla Personas";
    static int contadorUsuarios=0; // Así hacemos que la clase pueda contar la cantidad de instancias que se hacen.
    String name;
    int age;

    public MetodosEstaticos(String name,int age){
        this.name=name;
        this.age=age;
        contadorUsuarios+=1;
    }

    public void saludar(){
        System.out.println("Saludamos a la tabla desde el objeto: " + Tabla);
    }

    // Así podremos Usar la variable estática para guardar al usuario en la tabla.
    // Mediante este método de clase y la variable de clase. No hay necesidad de que los objetos intervengan
    public static void guardar(MetodosEstaticos usuario){
        System.out.println("Guardando Usuario "+ usuario.name+ " en : "  + Tabla );
    }

    public static void main(String[] args){
        MetodosEstaticos persona1=new MetodosEstaticos("martin",18);

        System.out.println(MetodosEstaticos.contadorUsuarios); // Contador de instancias de la clase.

        MetodosEstaticos.guardar(persona1); // Guardando el usuario een la tabla.

    }


}

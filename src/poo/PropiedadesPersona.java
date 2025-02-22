package poo;

public class PropiedadesPersona {
    // Propiedades
    String name;
    private int edad;
    // Inicializamos por defecto el dni de la persona
    int DNI=31894388;

    public void saludar(){
        // Para poder hacer referencia a una propiedad en un método debemos usar la palabra this.Propiedad
        System.out.println("Hola cómo estás "+this.name);
    }

}

package poo;

public class Main {
    public static void  main(String[] args){
        PropiedadesPersona persona= new PropiedadesPersona(); // ASi INSTANCIAMOS UN OBJETO DE UNA CLASE
        persona.name="martin";
        // Al ser tipo por referencia, es como un puntero a la misma dirección de memoria
        PropiedadesPersona aux=persona;
        persona.name="Alejandro";

        System.out.println(aux.name);
        aux.name="Robert";
        System.out.println(persona.name);
        System.out.println(persona.DNI);
        // Llamamos al método de la clase
        persona.saludar();

    }
}

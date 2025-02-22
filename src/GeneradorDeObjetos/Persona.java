package GeneradorDeObjetos;

public class Persona {
    private static  Persona[] personas= new Persona[5]; // Array de Personas
    /*
    Por ejemplo internamente si nos sirve el uso de la cantidad de usuarios para usarlo
     como índice en el array de persona. Pero, desde otras partes del programa nos puede interesar
     conocer la cantidad de personas en el arreglo, pero, no nos interesa que se pueda acceder
     a ese atributo y modificarlo. Para solucionar esto usamos como privado este atributo
     y cuando se quiera saber la información de cuántas personas hay en el arreglo
     la exponemos de forma segura mediante un método de clase. un "Getter".

     Así aprovechamos este atributo de manera interna pero a la hora de exponerlo lo hacemos de forma segura.

    */


    private static int cantPersonas=0;
    private String name;
    private int edad;
    
    public Persona(String name,int edad){
        this.name=name;
        this.edad=edad;
    }


    
    public static void crearPersona(String name,int edad){
        if (cantPersonas<5)
        {
            Persona nuevaPersona=new Persona(name,edad);
            personas[cantPersonas] = nuevaPersona;
            cantPersonas += 1; // Aumentamos la cantidad de personas en el array.

        }
    }


    static int getCantPersonas(){
        return cantPersonas;
    }


    static void infoPersonas(){
        int contador=0;
        for(int i=0;i<personas.length;i++){
            System.out.println( (contador   +  1 )    + " ) " +   personas[i].name   +   ", Edad:  "  +  personas[i].edad    );
            contador+=1;
        }
    }
    
    
}

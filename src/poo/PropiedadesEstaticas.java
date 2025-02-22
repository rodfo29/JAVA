package poo;

public class PropiedadesEstaticas {
    // Hay datos que adiferencia de otros como podría ser en una tabla su nombre podemos usar propiedades estáticas
    // Por ejemplo si modificamos el nombre de la tabla queremos que el cambio se muestre en todos los usuarios no es uno solo el cual sería el que hace el cambio.
    // Eso lo podemos solucionar haciendo el nombre de la tabla una propiedad estática. ESto permite que todas las variables tendrán siempre en cuenta a esa propiedad en concreto
    // Osea todas las instancias de la clase siempre estarán al tanto de esa propiedad estática, si se hace un cambio, ese cambio le aparecerá a todas las instancias.
    static String Tabla="Tabla Personas"; // En pocas palabras, La hacemos una variable de la clase únicamente.
    String nombreAerolinea;


    public PropiedadesEstaticas(String nombreAerolinea){
        this.nombreAerolinea=nombreAerolinea;
    }

    // Un ejemplo es que podemos usar igual la variable estática en métodos de las instancias.
    void saludar(){
        System.out.println("Hola usuario desde la tabla " + Tabla); // La propiedad estática la usamos sin el this
    }

    public static void main(String[] args){
        PropiedadesEstaticas persona1=new PropiedadesEstaticas("FLY EMIRATES");
        persona1.saludar();
        System.out.println(PropiedadesEstaticas.Tabla); // ASi accedemos a la variable  estática, mediante la propia clase

    }



}

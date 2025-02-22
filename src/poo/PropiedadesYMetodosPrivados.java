package poo;

public class PropiedadesYMetodosPrivados {
    static String tableName="Tabla usuarios";


    static int contUsers=0;
    String name;
    private int edad; // Hace que esta propiedad no pueda ser modificada desde afuera de la clase.

    public PropiedadesYMetodosPrivados(String name,int edad){
        this.name=name;
        this.edad=edad;
        contUsers+=1;
    }




    // Mediante eun getter devolvemos la edad del usuario.
    public int getEdad(){
        return this.edad;
    }
    public void saludar(){
        System.out.println("Hola mundo! soy " + tableName);
    }

    // Este método solo lo podemos usar adentro de esta clase
    private int metodoprivado(){
        System.out.println("Procesando datos ...");
        return this.edad;
    }
    public void  EjemploDePoderUsarElMetodoPrivado(){
        this.metodoprivado(); // Recordar qeu debemos usar this ya que estamos accediendo a un método que es de las instancias.
    }


    public static void main(String[] args){
        PropiedadesYMetodosPrivados persona1= new PropiedadesYMetodosPrivados("Martin",18);
        System.out.println(PropiedadesYMetodosPrivados.contUsers);
        persona1.EjemploDePoderUsarElMetodoPrivado();


    }

}

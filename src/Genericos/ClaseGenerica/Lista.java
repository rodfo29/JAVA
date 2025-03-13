package Genericos.ClaseGenerica;

// La comunidad ha definido T,V,Q,R,K para darle nombre a los genéricos.
// Este ejemplo da error ya que no podemos hacer qeu un tipo Number castee al Object, si queremos usar este código debemos quitar la restricción para poder usar el cast de "t".
public class Lista <T extends Number> { // Podemos limitar los tipos de genéricos aceptados.
    private T[] data=(T[]) new Object[50]; // Creamos un arreglo Object que luego vamos a castear con el tipo de dato genérico ingresado.
    private int length=0;

    // Los métodos que originalmente serían void pueden devolver this para permitir encadenamiento (fluent interface).
    // Si un método devuelve un tipo distinto de la clase, no se puede encadenar después de él.
    public Lista<T> add(T t){

        data[length++]=t;
        return this; // Haciendo esto cada vez que añadimos un nuevo elemento devolvemos la instancia de la lista, lo que permite concatenar instrucciones.

    }


    public T get(int index){
        return data[index];
    }


}

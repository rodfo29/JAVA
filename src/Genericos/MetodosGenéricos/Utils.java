package Genericos.MetodosGenéricos;
// Esta es una convención para construir nuestras propias herramientas.
public class Utils {

    public static <T extends Number> T max(T a, T b){
       return a.doubleValue()>b.doubleValue()?a:b; // me devuelve el valor que se encuentra de la intancia del objeto a (El cual es el que lo llama) en el tipo indicado
        // De esa manera podemos obtener los números, convertirlos a valores que podamos comparar y luego retornar alguno cumpliendo el tipo de retorno.
    }
    // Acá podemos recibir todo tipo de dato que extienda de number y operarlo, al final nos debe retornar un double.
    public static <T extends Number> double multi(T a, T b){
        return a.doubleValue()*b.doubleValue(); // independientemente, el valor ingresado los estamos convirtiendo en double para operar.
    }


}

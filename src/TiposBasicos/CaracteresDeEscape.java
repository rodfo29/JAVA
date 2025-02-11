package TiposBasicos;

public class CaracteresDeEscape {
    public static void main(String[] args){
        String texto="Hola \"Mundo\""; // De esta manera escapamos caracteres.
        String texto2="C:Hola\\Mundo"; // En caso de que queramos escapar el caracter "\" Podemos hacerlo con el mismo \ seguido.
        String texto3="Martín\tPinto"; // Para agregar una tabulación podemos hacer uso de "\t".
        System.out.println(texto3);

    }
}

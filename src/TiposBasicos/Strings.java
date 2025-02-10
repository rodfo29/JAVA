package TiposBasicos;

public class Strings {
    public static void main(String[] args){
        String text=new String("Hola mundo!!"); // Esta manera es muy redundante
        String text2="Hola Mundo!"; // Lo podemos hacer de esta manera. (String Liteal)

        int longitud=text2.length();
        String texto3=text2.replace("Hola","martin");
        System.out.println("esa es mi cadena de texto: "+text2+"Tiene una Longitud de : "+longitud);
        System.out.println("Ahora con el cambio esta es la nueva cadena: "+texto3);

        System.out.println(texto3.endsWith("undo!"));
        System.out.println(texto3.startsWith("Ch"));
        System.out.println(texto3.contains("und"));


        System.out.println(texto3.toUpperCase());
        System.out.println(texto3.toLowerCase());

        String sinEspacios="   martin   pinto      ";
        System.out.println(sinEspacios.trim()); // Nos quita los espacios del inico y final de texto
        System.out.println( sinEspacios); // Nos muestra todos los espacios de la cadena


    }
}

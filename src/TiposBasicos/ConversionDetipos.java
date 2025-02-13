package TiposBasicos;

public class ConversionDetipos {
    public static void main(String[] args){
        // Conversión implícita
        byte a =1;      // Java se encarga de rellenar la memoria que necesita el tipo de dato más pequeño par poder operarlo con el que sea más grande
        int b=15;
        int c=a+b;

        // Conversión Explícita
        int x =15;
        double y=15.015;
        int z= (int)(x+y); // Tipo c que antes de la variable ponemos en paréntesis el tipo de dato que queremos convertir el valor o la variable misma.

        String j="1.1";
        String t="2";
        int k=5;
        double h=Double.parseDouble(j)+k; // De esta manera podemos castear un String ----> Double -----|
        //                                                                                              |---- > Igual con los tipos de dato: Byte, Long, Short, etc. Solo hay que Cambiar
        int l= Integer.parseInt(t)+k; // De esta manera Casteamos un String ---> Integer.           ----|---- > el nombre de la clase.
        System.out.println(l);
        System.out.println(h);


    }


}

package TiposBasicos;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatoDeNumeros {
    public static void main(String[] args){
        // Poder mostrar los números como porcentajes o tipos de monedas

        Locale locale= Locale.forLanguageTag("es-PE"); // Así indicamos de forma local en que lugar estamos.

       NumberFormat numberFormat= NumberFormat.getCurrencyInstance(locale); // Pasamos la localización y luego nos retornará un formato con la moneda local automáticamente.
       NumberFormat numberFormat1=NumberFormat.getPercentInstance(locale);
       String result=numberFormat.format(37); // Obtenemos un formato de la moneda local y el valor de argumento

        // Porcentajes:
        String Porcentaje=numberFormat1.format(1); // ---> 100%
        String Porcentaje_2=numberFormat1.format(0.25); // ---> 25%

       System.out.println(Porcentaje_2);
       System.out.println("Total a pagar: "+result);
    }
}

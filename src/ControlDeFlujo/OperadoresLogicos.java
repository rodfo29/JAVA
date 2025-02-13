package ControlDeFlujo;

public class OperadoresLogicos {
    public static void main(String[] args){
       boolean a=true;
       boolean b=false;

       boolean d=a&&b; // OR
       boolean c=a||b; // AND
       boolean e=!a; // NOT

        // ===== Casos de uso ===
        // Validar que una persona está viva, una funcionalidad está activa, Validar que algo sea premium, algo encendido etc.
        boolean isActive=true;
        boolean isAdult=false;
        boolean isPremium=true;
        boolean isOn=true;


        String cadena1="martin";
        String cadena2="martin";
        boolean resultadoCadenas=cadena1==cadena2;
        System.out.println("igualdad de las cadenas: "+ resultadoCadenas);

        // Validar que el cupón que ingresa el usuario sea válido y aplique para el descuento
        String coupon="PROGRAM-2025";
        boolean promo=coupon.equals("PROGRAM-2025") || coupon.equals("POMO-2025");
        System.out.println("El cupon de descuento es válido: " + promo);

        // Validar que un usuario sea mayor de edad, esté activo y además tenga los fondos suficientes
        boolean hasFunds=true;
         boolean canPurchase= isActive && isAdult && hasFunds;
        System.out.println("La persona puede comprar el videojuego? : " + canPurchase );


        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}

package TiposBasicos;

public class ClaseMath {
    public static void main(String[] args){
        System.out.println(Math.abs(-15)); // valor absoluto
        System.out.println(Math.ceil(10.00001)); // toma un numero y lo redondea al numero de más arriba
        System.out.println(Math.floor(10.9999)); // Redondea el numero hacia abajo
        System.out.println(Math.max(15,25)); // Máximo entre 2 números
        System.out.println(Math.min(20,8)); // Mínimo entre 2 números
        System.out.println(Math.round(15.5)); // Redondea al número más cercano
        double random=Math.random(); // Nos genera un valor aleatorio pero double

        System.out.println("opción 1: "+ Math.round(random*100));// Opción Número Aleatorio 1
        System.out.println( "opción 2: "+ (int)(random*100) );// Opción Nùmero Aleatorio 2, ** Nota: Recordar envolver entre paréntesis la opción del "Random*100"0

    }
}

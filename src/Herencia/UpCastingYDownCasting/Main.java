package Herencia.UpCastingYDownCasting;

public class Main {
    // Este método nos permite mostrar la información de toda la Familia de clases "Juego".
    static void  infoJuego(Juego juego){
        // Validamos si la el objeto puede hacer el DownCasting a la clase fifa.
        if (juego instanceof Fifa) {
            Fifa fifa = (Fifa) juego; // Creamos una nueva variable aplicando el DownCasting a la subclase indicada.
            fifa.metodoSoloDeFifa(); // La variable Juego sigue igual, por lo que si puede aplicar para las siguientes líneas de código.
        }


        /* Aplicaríamos el Down casting por ejemplo si en el caso de que recibamos un objeto de tipo Juego no
        podríamos acceder a los métodos
        * */
        System.out.println("Nombre del juego : " + juego.getName());
        System.out.println("Nombre del juego : " + juego.getPrice());

    }
    // Ejemplo de DownCasting

    public static void main(String[] args){
        Fifa fifa25=new Fifa("EA SPORTS FC 25",79.99f);
        Fifa fifa2000=new Fifa("EA SPORTS FC 25",79.99f); // Ejemplo para el validar si los objetos tienen el mismo nombre.
        System.out.println(fifa25.equals(fifa2000));


        Warzone warzoneBattleRoyale= new Warzone("Warzone Online", 79.99f);

        infoJuego(fifa25);
        infoJuego(warzoneBattleRoyale);

    }

}

package ControlDeFlujo;

public class Alcance {
    public static void main(String[] args){
        String mensaje="Seco para programar";// Podemos acceder a ella desde el mismo nivel o niveles más profundos, pero no podemos por ejemplo a otros métodos.

        if (true)
        {
            String texto="Hola Mundo"; // Solo podemos acceder a la variable desde este bloque no desde el exterior, el bloque lo generan los paréntesis.
            System.out.println(texto);
            if (true)
            {       mensaje="Hola putos";
                    System.out.println(mensaje);
                    System.out.println("Accedemos desde el 2do bloque");
            }
        }
//        System.out.println(texto); // como podemos ver no podemos acceder a la variable texto, ya que esta se encuentra únicamente en el alcance del condicional
                                  // Está limitada a lo que ocurre en ese bloque o en bloques más internos, No hacia el exterior.

    }
}

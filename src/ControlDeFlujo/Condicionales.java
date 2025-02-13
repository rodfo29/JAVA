package ControlDeFlujo;

public class Condicionales {

    public static void main(String[] args) {
        int edad = 18;
        // Además podemos también validar si la pelicula tiene algún tipo de restricción
        String movieClassification = "R18";
        boolean isRestricted = movieClassification.contains("R");
        System.out.println("La película está prohibida: " + isRestricted);

        if (edad >= 18&& !isRestricted) {

            System.out.println("La persona si puede ver la película");
        } else
            {
                System.out.println("Papi no puedes ver la peli...···...");
            }
    }
}

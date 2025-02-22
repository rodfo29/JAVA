package TiposDeDependencias.Ejemplo1;

import TiposDeDependencias.Ejemplo1.Coche;
import TiposDeDependencias.Ejemplo1.Motor;
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.arrancar(); // "Motor encendido"
        miCoche.frenar();
    }
}

package TiposDeDependencias.Ejemplo1;

import TiposDeDependencias.Ejemplo1.Motor;

public class Coche {
    private Motor motor; // Dependencia

    public Coche() {
        this.motor = new Motor(); // Se crea el motor dentro de Coche
    }

    public void arrancar() {

        this.motor.encender(); // Coche depende de Motor
    }

    public void frenar(){
        this.motor.apagar();
    }
}

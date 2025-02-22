package TiposDeDependencias.Ejemplo2;

// Inyección de dependencias
class Coche {
    private final Motor motor; // Dependencia

    public Coche(Motor motor) { // Recibe el motor desde afuera
        this.motor = motor;
    }

    public void arrancar() {
        this.motor.encender();
    }

    public static void main(String[] args) {
        Motor miMotor = new Motor();
        Coche miCoche = new Coche(miMotor); // Pasamos la dependencia
        miCoche.arrancar(); // "Motor encendido"
    }
}

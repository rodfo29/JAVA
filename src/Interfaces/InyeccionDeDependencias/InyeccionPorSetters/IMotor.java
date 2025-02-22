package Interfaces.InyeccionDeDependencias.InyeccionPorSetters;

public interface IMotor {

    void encender();
    void apagar();
    void recargarMotor();   // Recargar el motor de combustible o de energía.
    void infoMotor(); // Detalles del motor, nombre, modelo, etc.
    boolean motorStatus(); // Estado del motor: (Encendido= True) === (Apagado = false)
}

// a la hora de usar como tipo de dato IMotor, el polimorfismo solo nos dejará usar los métodos que tengan
// en común en la interfaz, ya que esta es la que se encarga de relacionar todos los tipos de motores.

// Esta actúa como la clase superMadre.


// clases que no terminar de  relacionarse/ser semejantes del todo en cuanto a atributos/métodos, y que al cumplir este contrato esteblecido, ya pueden implementar todo tipo de atributos y métodos propios,
// considerándose aún motores, y además, permitiendo relacionarlos bajo 1 mismo tipo de dato.

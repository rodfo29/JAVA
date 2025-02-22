package Interfaces.InyeccionDeDependencias.InyeccionPorSetters;

public class Carro {
    private IMotor motor; // Solo podremos usar los métodos que tenga en común a partir de la interfaz,
                          // ya que esa por así decirlo es la relación que guardan todos los tipos de motores.

    public Carro(IMotor motor){
        this.motor=motor; // Podemos tener como atributo tanto un motor a gasolina como un motor eléctrico.
    }


    // Usando un setter tenemos la posibilidad de cambiar la dependencia en caliente.
    public void setMotor(IMotor newMotor){
        this.motor=newMotor;
    }


    public void infoMotor(){
        this.motor.infoMotor(); // Desplegamos la información del motor
    }
}

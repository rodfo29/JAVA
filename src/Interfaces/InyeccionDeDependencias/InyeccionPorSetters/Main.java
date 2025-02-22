package Interfaces.InyeccionDeDependencias.InyeccionPorSetters;

public class Main {

    public static void main(String[] args){
        IMotor motorCombustible= new MotorCombustible("Ford EcoBoost 1.0L 3-cilindros",Combustible.GASOLINA);
        IMotor motorElectrico=new MotorElectrico("Siemens 1FT6 Series Synchronous Motor");

        Carro corolla=new Carro(motorElectrico);
        corolla.infoMotor();

        corolla.setMotor(motorCombustible); // Con este setter podemos cambiar las dependencias en caliente.

        corolla.infoMotor();
        corolla.encenderCarro();
        corolla.acelerar();
        corolla.acelerar();
        corolla.acelerar();
        corolla.acelerar();

        corolla.frenar();
        corolla.frenar();
        corolla.frenar();
        corolla.frenar();

        corolla.apagarCarro();
        corolla.acelerar();
    }
}

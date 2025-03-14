package Interfaces.InyeccionDeDependencias.InyeccionPorSetters;

public class MotorElectrico implements IMotor{
    private String modeloMotor;
    private boolean isActive;
    private double medidorEnergia;

    public MotorElectrico(String modeloMotor){
        this.isActive=false;
        this.medidorEnergia=0.0;
        this.modeloMotor=modeloMotor;
    }

    @Override
    public void encender(){
        if (!this.isActive) {
            this.isActive = true;
            System.out.println(" Motor Encendido...");
        }

    }
    @Override
    public void apagar(){
        if (this.isActive) {
            this.isActive = false;
            System.out.println("Apagando motor...");
        }
    }

    @Override
    public void recargarMotor(){
        this.medidorEnergia=100;
        System.out.println("Recargando Energía .....");
    }

    @Override
    public void infoMotor(){
        System.out.println("\n\nModelo: "   +   this.modeloMotor    +   "\nTipo de motor: Eléctrico ");
    }

    @Override
    public boolean motorStatus(){
        return this.isActive;
    }
}


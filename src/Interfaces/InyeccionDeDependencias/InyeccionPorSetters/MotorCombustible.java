package Interfaces.InyeccionDeDependencias.InyeccionPorSetters;

public class MotorCombustible implements IMotor{
    private String modeloMotor;
    private Combustible tipoCombustible;
    private boolean isActive;
    private double medidorCombustible;

    public MotorCombustible(String modeloMotor,Combustible tipoCombustible){

        this.isActive=false; // Cada vez que creemos un motor estará apagado.
        this.medidorCombustible=0;
        this.tipoCombustible=tipoCombustible;
        this.modeloMotor=modeloMotor;

    }

    @Override
    public void encender(){

        if (!this.isActive){
            this.isActive=true;
            System.out.println("Motor Encendido....");
        }else{
            System.out.println("Motor Ya encendido!!!");
        }
    }

    @Override
    public void apagar(){
        if (this.isActive){
            this.isActive=false;
            System.out.println("Apagando motor...");
        }else{
            System.out.println("El moto ya está apagado!!!");
        }
    }

    @Override
    public void recargarMotor(){

        this.medidorCombustible=100;
        System.out.println("Recargando combustible....");
    }


    @Override
    public void infoMotor(){
        System.out.println("\n\nModelo: "   +   this.modeloMotor    +  "\nTipo de Motor: Combustible"  + "\nTipo de Combustible: "   +   this.tipoCombustible);
    }

    @Override
    public boolean motorStatus(){
        return this.isActive;
    }
}

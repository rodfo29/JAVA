package Interfaces.InyeccionDeDependencias.InyeccionPorSetters;

public class Carro {
    private IMotor motor; // Solo podremos usar los métodos que tenga en común a partir de la interfaz,
                         // ya que esa por así decirlo es la relación que guardan todos los tipos de motores.
    private int velocidad;

    public Carro(IMotor motor){
        this.motor=motor; // Podemos tener como atributo tanto un motor a gasolina como un motor eléctrico.
        this.velocidad=0; // El carro por defecto tendrá una velocidad de 0 km/h.
    }


    // Usando un setter tenemos la posibilidad de cambiar la dependencia en caliente.
    public void setMotor(IMotor newMotor){
        this.motor=newMotor;
    }

    public void encenderCarro(){
        if (!this.motor.motorStatus()){ // Estra en el "if" si el devuelve un status falso, ya que con " ! " cambia a true. false ==== > true. Lo que permite ingresar a la primera condición.
            System.out.println("Encendiendo Carro ...");
            this.motor.encender();
        }else{
            System.out.println("El carro ya está encendido!!!!");
        }
    }



    public void apagarCarro(){
        if (this.motor.motorStatus()){
            System.out.println("Apagando Carro");
            this.motor.apagar();
        }else{
            System.out.println("El carro ya está apagado!!! ");
        }



    }



    public void infoMotor(){
        this.motor.infoMotor(); // Desplegamos la información del motor
    }

    public void acelerar(){
        if (this.motor.motorStatus()){ // si el motor está encendido podemos acelerar.
            System.out.println("[+] Aumentando velocidad: " +   this.velocidad  +   " ---> " +   (this.velocidad+=10));
        }else {
            System.out.println("[!] El carro está apagado, por favor encender para poder acelerar...");
        }
    }

    public void frenar(){
        if (this.motor.motorStatus() && this.velocidad>0){ // si el motor está encendido podemos acelerar y la velocidad es como mínimo mayor que 0;
            System.out.println("[+] Disminuyendo velocidad: "   +   this.velocidad  +   " ---> "  +  (this.velocidad-=10) );
        }else if (this.velocidad==0){
            System.out.println("[!] No podemos seguir disminuyendo la velocidad...");
        }else {
            System.out.println("[!]  El motor debe estar encendido");
            ;
        }

    }

}

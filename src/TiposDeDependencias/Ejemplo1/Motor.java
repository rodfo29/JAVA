package TiposDeDependencias.Ejemplo1;

public class Motor {
   private boolean isActive;

   public Motor(){
       this.isActive=false; // cuando se cree un nuevo motor, su estado será apagado.
   }


    public void encender() {
       if (!this.isActive){ // Se activa solo si el motor está apagado.
       System.out.println("Motor encendido");
       this.isActive=true; // Cambiamos el estado a encendido.
       }
    }

    public void apagar(){
       if (this.isActive){
           System.out.println("Apagando motor");
           this.isActive=false; // Cambiamos el estado a apagado.
       }
    }



}

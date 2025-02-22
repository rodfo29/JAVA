package Herencia.recursos;

// Lo usamos cuando no nos sirva la implementación de un método de la superclase
public class MethodOverride extends Base {

    int edad;

    public MethodOverride(String name, int edad){
        // LLamamos explícitamente al método super() ya que el constructor padre tiene parámetros
        super(name); // la superclase se encargará de inicializar este atributo.
        this.edad=edad; // Solo debemos preocuparnos por inicializar los que no estén en la superclase.
    }



    // Sobreescribimos el método de la superclase para usar una implementación que si nos guste.
    @Override
    public void saludar(){
        // Podemos también reutilizar métodos de la superclase.
        String saludoSuperClase=super.ejemploSuperSuperClase();
        System.out.println("Hola " + saludoSuperClase);
    }

    public static void main(String[] args){
        MethodOverride metodo1=new MethodOverride("martin pinto",18);

        System.out.println(metodo1.getName());;
    }
}

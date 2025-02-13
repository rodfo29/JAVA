package ControlDeFlujo;

public class ForEach {
    public static void main(String[] args)
    {
        String[] personajes={"goku","vegeta","piccolo","gohan","raditz"};

        for(int i=0;i<personajes.length;i++)
        {
            System.out.println(personajes[i]);
        }

        // Usamos el forEach
        System.out.println("\n\nForEach: ");
        for(String personaje:personajes){ // Formula: VariableDelMismoTipoDelArreglo: Collection/iterable
            System.out.println(personaje);
        }
    }
}

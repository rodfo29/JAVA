package Herencia.ClaseAbstracta;

// Dependendiendo de la rareza la carta puede aumentar sus habilidades.

public enum Rareza {
    BRONCE(2,"BRONCE"),PLATA(5,"PLATA"),ORO(10,"ORO"); // Llamadas al constructor.
    private final int bonus;
    private final String nombreRareza;


    Rareza(int bonus,String nombreRareza){
        this.bonus=bonus;
        this.nombreRareza=nombreRareza;
    }


    public int getBonus(){
        return this.bonus;
    }
    public String getNombreRareza(){
        return this.nombreRareza;
    }

}

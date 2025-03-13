package Interfaces.InyeccionDeDependencias.InyeccionPorMetodo;

public class Restaurante {

    // ahora la clase Restaurante no depende únicamente de un numero finito de mesoneros, sino que ahora
    // puede recibir una cantidad indefinida de mesoneros y asignarle llevar Cerveza a las mesas.
    public  static void llevarCerveza(Mesonero[] mesoneros){
        for (int i=0;i<mesoneros.length;i++){
            mesoneros[i].atenderMesa();
        }
    }


}

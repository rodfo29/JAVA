package Interfaces.InyeccionDeDependencias;

// Solucinamos el problema del ejemplo de inyección por método
// el cual recibia los mesoneros para activar el método de atender mesa.
// Pero realmente queremos que cualquier persona que este disponible pueda atender las mesas.


// Solo queremos que tenga ese comportamiento en común.
// Usamos la convención I antes del nombre de la interfaz.
public interface IAtenderMesa {
    void atenderMesa();
    // en Java, todos los métodos de una interfaz son public y abstract por defecto.
}

package exepciones;

public class EdadInvalidaException extends Exception{ // Debemos heredar de exception o RuntimeException
    public EdadInvalidaException(){
        super("Edad inválida, debe ser un positivo..");
    }
    public EdadInvalidaException(String mensaje){
        super(mensaje);
    }
}

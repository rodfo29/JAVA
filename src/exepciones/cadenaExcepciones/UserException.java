package exepciones.cadenaExcepciones;

public class UserException extends Exception{ // comprobada
    public UserException(Exception e){
        super(e);
    }
}

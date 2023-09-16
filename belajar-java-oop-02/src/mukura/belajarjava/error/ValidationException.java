package mukura.belajarjava.error;

/*
*  Materi Exception
*
* */

// membuat Class Exception
public class ValidationException extends Throwable {
    // Constructor
    public ValidationException(String message){
        super(message);
    }
}

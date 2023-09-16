package mukura.belajarjava.error;


/*
*   Materi Error
*
* */

// membuat Error
public class DatabaseError extends Error {
    // constructor
    public DatabaseError(String message){
        super(message);
    }
}

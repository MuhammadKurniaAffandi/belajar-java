package mukura.belajarjava.util;

import mukura.belajarjava.data.LoginRequest;
import mukura.belajarjava.error.BlankException;
import mukura.belajarjava.error.ValidationException;

/*
 *  Materi Exception
 *
 * */
public class ValidationUtil {
    // membuat Exception
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()){
            throw new ValidationException("Username is isBlank");
        } else if (loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()){
            throw new ValidationException("Password is isBlank");
        }
    }


    /*
    *  Materi untuk Runtime Exception
    * */
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()){
            throw new BlankException("Username is isBlank");
        } else if (loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()){
            throw new BlankException("Password is isBlank");
        }
    }
}

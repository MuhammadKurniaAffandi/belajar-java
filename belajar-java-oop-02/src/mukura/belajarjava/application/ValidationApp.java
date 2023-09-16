package mukura.belajarjava.application;

/*
 *  Materi Exception
 *
 * */

import mukura.belajarjava.data.LoginRequest;
import mukura.belajarjava.error.ValidationException;
import mukura.belajarjava.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        // cara menggunakan/memanggil Exception yang sudah dibuat
        LoginRequest loginRequest = new LoginRequest("Fandi", "rahasia");

        // Exception digunakan dengan membuat block try catch
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        }
        // cara 1
       /* catch (ValidationException exception){
            System.out.println("Data tidak valid : " + exception.getMessage());
        } catch (NullPointerException nullPointerException){
            System.out.println("Data null : " + nullPointerException.getMessage());
        }
       */

        // cara 2
        catch (ValidationException | NullPointerException exception){
            System.out.println("Data tidak valid : " + exception.getMessage());
        }
        // finally keyword
        finally {
            System.out.println("Selalu dieksekusi");
        }


        /*
         *  Materi untuk Runtime Exception
         * */
        // mengakses Runtime Exception yang sudah dibuat
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");



    }
}

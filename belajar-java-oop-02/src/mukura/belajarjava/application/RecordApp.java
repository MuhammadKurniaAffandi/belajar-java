package mukura.belajarjava.application;

import mukura.belajarjava.data.LoginRequest;

/*
 *  Materi Record Class
 *
 * */
public class RecordApp {
    public static void main(String[] args) {

        // cara menggunakan Record Class
        LoginRequest loginRequest =  new LoginRequest("fandi", "rahasia");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        // mengakses Record Overloading
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("fandi"));
        System.out.println(new LoginRequest("kurnia", "tara"));
    }
}

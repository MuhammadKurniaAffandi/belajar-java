package mukura.belajarjava.application;

/*
 *   Materi Error
 *
 * */

import mukura.belajarjava.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        // memanggil method connectDatabase
        connectDatabase("fandi", null);
        System.out.println("Sukses connect");
    }

    // method connect database yang terjadi error
    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak bisa connect ke database");
        }
    }
}

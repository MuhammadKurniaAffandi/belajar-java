package mukura.belajarjava.data;

/*
* Materi Final Class
* */

class SosialMedia {
    String name;
}


class facebook extends SosialMedia {
    final void login(String username, String password){
        // isi method
    }
}

class FakeFacebook extends facebook {
    /*  akan ERROR

    void login(String username, String password){
        // isi method
    }*/
}

package mukura.belajarjava.data;

/*
*  Materi Record Class
*
* */

// membuat Record Class
public record LoginRequest(String username, String password) {

    // membuat Record Class Constructor
    public LoginRequest{
        System.out.println("Membuat object Login Request");
    }

    // Record Overloading
    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
       this("", "");
    }

}

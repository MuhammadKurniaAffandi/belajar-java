package mukura.belajarjava.data;

/*
*  Materi Enum Class
*
* */
public enum Level {

    // membuat Enum
    STANDARD("Standard Level"), // <-- harus memanggil Constructor
    PREMIUM("Premium Level"), // <-- harus memanggil Constructor
    VIP("VIP Level"); // <-- harus memanggil Constructor

    /* Membuat Members pada Enum Class*/

    // field
    private String description;

    // Constructor
    Level(String description){
        this.description =  description;
    }

    // method getter
    public String getDescription() {
        return description;
    }
}

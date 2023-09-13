package mukura.belajarjava.data;

/*
 *  Materi Static Keyword
 * */
public class Application {
    // implementasi Static Keyword pada Blok
    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class Application");
        PROCESSORS =  Runtime.getRuntime().availableProcessors();
    };
}

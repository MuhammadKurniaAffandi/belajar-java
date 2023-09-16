package mukura.belajarjava.application;

/*
*  Materi StackTraceElement class
*
* */
public class StackTraceApp {
    public static void main(String[] args) {

        // implementasi StackTraceElement
        /*
        try{
            String[] names = {
                    "Muhammad",
                    "Kurnia",
                    "Affandi"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
            throwable.printStackTrace();
        }
        */

        // implementasi Multiple StackTraceElement
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

    }

    // menerapkan Multiple StackTraceElement
    // method pertama
    public static void sampleError(){
        try{
            String[] names = {
                    "Muhammad",
                    "Kurnia",
                    "Affandi"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}

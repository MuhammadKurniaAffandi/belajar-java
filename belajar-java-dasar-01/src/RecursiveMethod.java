import org.w3c.dom.ls.LSOutput;

public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println("==== Method Recursive ====");
        System.out.println(factorialRecursive(5));

        // loop(100000);
    }

    // tanpa method recursive dengan menggunakan perulangan for
    static int factorialLoop(int value) {
        var result = 1;
        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    /* implementasi Method Recursive*/
    static int factorialRecursive(int value) {
        if (value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    /* Hati-hati dalam menggunakan Method Recursive
    * karena akan menyebabkan StackOverflow
    * Berikut ini adalah Method Recursive yang menyebabkan StackOverflow
    * */
    static void loop(int value){
        if(value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop" + value);
            loop(value - 1);
        }
    }

}


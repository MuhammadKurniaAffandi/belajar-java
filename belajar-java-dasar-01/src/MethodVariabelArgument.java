public class MethodVariabelArgument {
    public static void main(String[] args) {

        /* Cara Lama*/
        /*int[] values = {70, 55, 90, 50, 75};
        sayCongrats("Kurnia", values);*/

        sayCongrats("Affand", 85, 80, 78, 95);

    }

    /* Cara Lama*/
//    static void sayCongrats(String name, int[] values){
//        var total = 0;
//        for (var value: values){
//            total += value;
//        }
//
//        var finalValue = total / values.length;
//        if (finalValue >= 75){
//            System.out.println("Selamat " + name + ", Anda Lulus");
//        } else {
//            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
//        }
//    }


    /* Cara Baru*/
    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value: values){
            total += value;
        }

        var finalValue = total / values.length;
        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}

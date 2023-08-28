public class TipeDataArray {
    public static void main(String[] args) {
        /* Membuat Array*/
        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "Muhammad";
        stringArray[1] = "Kurnia";
        stringArray[2] = "Affandi";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        /* Array Initializer*/
        // cara 1
        int[] arrayInt = new int[]{
                10, 29, 80, 38, 43
        };

        // cara 2
        long[] arrayLong = {
                29, 80, 20, 40, 70
        };


        System.out.println(arrayInt.length);
        System.out.println(arrayLong.length);

        /* Array 2 Dimensi*/
        System.out.println("==== Array 2 Dimensi =====");
        String[][] members = {
                {"Muhammad", "Kurnia", "Affandi"},
                {"John", "Doe"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }
}

public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "E";

        switch (nilai){
            case "A":
                System.out.println("Wow, Anda Lulus dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungin Anda Salah Jurusan");
                break;

        }


        /* Switch Lambda */
        System.out.println("=== Switch Lambda ===");
        switch (nilai){
            case "A" -> System.out.println("Wow, Anda Lulus dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> System.out.println("Mungin Anda Salah Jurusan");

        }


        /* Switch Lambda tanpa Yield */
        System.out.println("=== Switch Lambda tanpa Yield ===");
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Wow, Anda Lulus dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "Mungin Anda Salah Jurusan";

        };
        System.out.println(ucapan);


        /* Switch Lambda dengan Yield */
        System.out.println("=== Switch Lambda dengan Yield ===");
        String speak = switch (nilai){
            case "A": yield  "Wow, Anda Lulus dengan Baik";
            case "B", "C" : yield "Nilai Anda Cukup Baik";
            case "D" : yield "Anda tidak lulus";
            default : yield "Mungin Anda Salah Jurusan";

        };
        System.out.println(speak);






    }
}

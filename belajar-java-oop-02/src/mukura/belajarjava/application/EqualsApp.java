package mukura.belajarjava.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Muhammad";
        first = first + " " + "Kurnia";

        System.out.println(first);

        String second = "Muhammad Kurnia";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Muhammad Kurnia";

        System.out.println(second == third);
        System.out.println(second.equals(third));


    }
}

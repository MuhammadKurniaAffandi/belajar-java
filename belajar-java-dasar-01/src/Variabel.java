public class Variabel {
    public static void main(String[] args) {
        String name;
        name = "Muhammad Kurnia Affandi";
        int age = 27;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

    /* Menggunakan keyword var*/
        var firstName = "Muhammad";
        var middleName = "Kurnia";
        var lastName = "Affandi";

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);

        /* Menggunakan keyword final*/
        final String application = "Belajar Java";
        // application = "Belajar Kotlin"; // Error
        System.out.println(application);
    }
}

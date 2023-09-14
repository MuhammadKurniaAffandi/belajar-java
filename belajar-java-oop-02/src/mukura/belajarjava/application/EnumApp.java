package mukura.belajarjava.application;

import mukura.belajarjava.data.Customer;
import mukura.belajarjava.data.Level;

/*
 *  Materi Enum Class
 *
 * */
public class EnumApp {
    public static void main(String[] args) {

        // mengakses Enum Class dari class Customer
        Customer customer = new Customer();
        customer.setName("Fandi");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        // mengkonversi Enum ke String
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        // mengkonversi String ke Enum
        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        // mengecek daftar Enum
        System.out.println("=== Daftar Enum pada Class Level");
        for (var value : Level.values()){
            System.out.println(value);
        }
    }
}

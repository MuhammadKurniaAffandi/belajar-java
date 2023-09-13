package mukura.belajarjava.application;

/*
 *  Materi Static Keyword
 * */


import static mukura.belajarjava.data.Application.PROCESSORS; // import static Blok
import static mukura.belajarjava.data.Constant.*; // import static variabel
import mukura.belajarjava.data.Country;
import mukura.belajarjava.util.MathUtil;

public class StaticApp {

    // cara mengakses Static variabel, method, dan inner class
    public static void main(String[] args) {

        // mengakses Static variabel
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        // mengakses Static method
        System.out.println(
                MathUtil.sum(2, 3, 4, 4, 5, 2)
        );


        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        // mengakses Static Blok
        System.out.println(PROCESSORS);
    }
}

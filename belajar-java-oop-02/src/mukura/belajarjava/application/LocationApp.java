package mukura.belajarjava.application;

import mukura.belajarjava.data.*;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Loacation(); // akan Error
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}

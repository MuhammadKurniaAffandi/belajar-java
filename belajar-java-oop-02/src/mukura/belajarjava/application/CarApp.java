package mukura.belajarjava.application;

import mukura.belajarjava.data.Avanza;
import mukura.belajarjava.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}

package mukura.belajarjava.application;

import mukura.belajarjava.data.Animal;
import mukura.belajarjava.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}

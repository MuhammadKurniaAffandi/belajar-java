/*
 * Materi Inheritance

 */

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Muhammad");
        manager.sayHello("Kurnia");

        VicePresident vp = new VicePresident("Affandi");
        vp.sayHello("Budi");

    }
}

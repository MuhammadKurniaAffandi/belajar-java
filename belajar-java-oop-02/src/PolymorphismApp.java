public class PolymorphismApp {
    public static void main(String[] args) {

        /*
        * menerapkan konsep Polymorphism
        * */

        Employee employee = new Employee("Fandi");
        employee.sayHello("Budi");

        employee = new Manager("Fandi");
        employee.sayHello("Budi");

        employee = new VicePresident("Fandi");
        employee.sayHello("Budi");

        System.out.println("===== Method Polymorphism =====");

        /*
        * Mengganggil Method Polymorphism
        * */
        sayHello(new Employee("Muhammad"));
        sayHello(new Manager("Kurnia"));
        sayHello(new VicePresident("Affandi"));
    }

    /*
    * Method Polymorphism
    * */
    static void sayHello(Employee employee){
        /* Type Check & Cast */
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}

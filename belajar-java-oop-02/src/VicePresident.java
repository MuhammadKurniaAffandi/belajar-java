/*
 * Materi Inheritance
 * */

// Class VicePresident sebagai child class dari class Manager
class VicePresident extends Manager {

    // Constructor Child class
    VicePresident(String name){
        // mengakses Constructor dari parent class
        super(name);
    }

    // Method Overriding dari parent class (Manager)
    void sayHello(String name){
        System.out.println("Hello "+ name + ", My Name Is VP "+ this.name);
    }
}

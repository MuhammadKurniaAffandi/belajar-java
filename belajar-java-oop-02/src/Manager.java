/*
 * Materi Inheritance
 * */

// Class Manager sebagai parent class
class Manager extends Employee {
    //    String name;
    String company;

    // Constructor
    Manager(String name) {
        super(name);

    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name Is Manager " + this.name);
    }
}

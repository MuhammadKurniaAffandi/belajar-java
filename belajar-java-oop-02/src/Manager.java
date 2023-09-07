/*
* Materi Inheritance
* */

// Class Manager sebagai parent class
class Manager {
    String name;
    String company;

    // Constructor
    Manager(String name){
        this.name = name;
    }

    Manager(String name, String company){
        this.name = name;
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hello "+ name + ", My Name Is Manager "+ this.name);
    }
}

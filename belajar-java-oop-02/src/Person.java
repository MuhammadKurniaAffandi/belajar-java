class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor class Person
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // Constructor Overloading
    Person(String name){
        // name = paramName;

        /* cara memanggil Constructor lain*/
        this(name, null);

    }

    // Constructor Overloading
    Person(){
        /* cara memanggil Constructor lain*/
        this(null);

    }
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}

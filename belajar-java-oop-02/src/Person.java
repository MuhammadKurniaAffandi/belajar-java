class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor class Person
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    // Constructor Overloading
    Person(String paramName){
        // name = paramName;

        /* cara memanggil Constructor lain*/
        this(paramName, null);

    }

    // Constructor Overloading
    Person(){
        /* cara memanggil Constructor lain*/
        this(null);

    }
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}

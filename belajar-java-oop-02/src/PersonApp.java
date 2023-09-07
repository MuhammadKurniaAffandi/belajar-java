public class PersonApp {
    public static void main(String[] args) {
        /* cara untuk membuat Object*/
        // var person1 = new Person();
        // person1.name = "Affandi";
        // person1.address = "Jakarta";

        // Menggunakan Constructor
        var person1 = new Person("Muhammad", "Jakarta");
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Pepen");

        // Menggunakan Constructor Overloading
        Person person2 = new Person("Kurnia");
        Person person3;
        person3 =  new Person();
        person3.name = "Fandi";
        person3.sayHello("Budi");
    }
}

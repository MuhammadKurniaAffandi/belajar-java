public class PersonApp {
    public static void main(String[] args) {
        /* Beberapa cara untuk membuat Object*/
        var person1 = new Person();
        person1.name = "Affandi";
        person1.address = "Jakarta";
//        Person person2 = new Person();
//        Person person3;
//        person3 = new Person();

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
    }
}

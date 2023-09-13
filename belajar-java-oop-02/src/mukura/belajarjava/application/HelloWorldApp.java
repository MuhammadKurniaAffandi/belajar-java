package mukura.belajarjava.application;

import mukura.belajarjava.data.HelloWorld;

/*
 *  Materi Anonymous Class
 *
 * */
public class HelloWorldApp {
    public static void main(String[] args) {

        // implementasi Anonymous Class
        HelloWorld english = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hello");
            }


            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hello");
            }


            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("Kurnia");

        indonesia.sayHello();
        indonesia.sayHello("Affandi");


    }
}

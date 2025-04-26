class Example {
    interface Greeting {
        void sayHi();
        default void sayHelloWorld(){
            System.out.println("Hello world");

        } 
        static void sayByeWorld(){
            System.out.println("Bye world");

        }
    }
}

class ActualExample implements Example.Greeting {
    public void sayHi(){
        System.out.println("Hi");
    }
    @Override
    public void sayHelloWorld() {
        System.out.println("Hello world");
    }
     
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Example.Greeting obj = new ActualExample();
        obj.sayHelloWorld();
    }
}

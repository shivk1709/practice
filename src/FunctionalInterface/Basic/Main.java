package FunctionalInterface.Basic;

public class Main
{
    public static void main(String[] args)
    {
        GreetingImpl greeting = new GreetingImpl();
        Greeting greeting1 = () -> System.out.println("Greeting From Functional Interface");
        greeting.setGreeting(greeting1);
        greeting.sayHello();
    }
}

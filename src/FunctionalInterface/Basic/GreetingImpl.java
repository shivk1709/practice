package FunctionalInterface.Basic;

public class GreetingImpl
{
    private Greeting greeting;

    public void setGreeting(Greeting greeting)
    {
        this.greeting = greeting;
    }

    public void sayHello()
    {
        System.out.println("Greeting called");
        greeting.wishMe();
    }
}

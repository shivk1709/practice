package Abstraction.withAbs;

public abstract class Animal
{
    public abstract void makeSound();

    public void doTask()
    {
        makeSound();
        System.out.println("Task done");
    }
}

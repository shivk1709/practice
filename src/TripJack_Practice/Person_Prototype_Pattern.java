package TripJack_Practice;

//1️⃣ What is Prototype Design Pattern?
//
//Type: Creational Design Pattern
//
//Purpose: Create new objects by copying (cloning) an existing object
// instead of creating from scratch.
//
//Key Idea: Use a prototype instance as a template, and produce new objects by cloning it.
//
//        ✅ This is useful when object creation is costly, or you want many similar
//        objects with slight variations.
//
//        2️⃣ How it Works
//
//You have a class that implements the Cloneable interface.
//
//You override the clone() method to create a copy of the object.
//
//Instead of new, you call clone() on the prototype object.
//

// Class implementing Prototype Pattern
public class Person_Prototype_Pattern implements Cloneable
{
    private String name;
    private int age;

    public Person_Prototype_Pattern(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Override clone() to enable object copying
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone(); // shallow copy
    }

    // Getter and Setter
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person_Prototype_Pattern{name='" + name + "', age=" + age + "}";
    }

    // Demo main method
    public static void main(String[] args) throws CloneNotSupportedException
    {
        // Original object (prototype)
        Person_Prototype_Pattern original = new Person_Prototype_Pattern("Alice", 30);

        // Clone the original object
        Person_Prototype_Pattern copy = (Person_Prototype_Pattern) original.clone();
        copy.setName("Bob"); // change only the clone's name

        System.out.println("Original: " + original); // Alice remains unchanged
        System.out.println("Copy: " + copy);         // Copy modified to Bob
    }
}


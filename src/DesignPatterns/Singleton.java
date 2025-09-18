package DesignPatterns;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable
{

    private static final long serialVersionUID = 1L;

    // volatile for double-checked locking
    private static volatile Singleton instance;

    private Singleton()
    {
        // Prevent reflection
        if (instance != null)
        {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            synchronized (Singleton.class)
            {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }

    // This method ensures the singleton after deserialization
    protected Object readResolve() throws ObjectStreamException
    {
        return getInstance();
    }

    public static void main(String[] args)
    {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        Singleton object3 = Singleton.getInstance();

        System.out.println(object3 == object1);  // true
    }
}

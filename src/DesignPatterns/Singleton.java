package DesignPatterns;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            synchronized (Singleton.class)
            {
                if(instance == null) instance = new Singleton();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        Singleton object3 = Singleton.getInstance();
        System.out.println(object3 == object1);

    }


}

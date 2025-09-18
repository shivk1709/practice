package FunctionalInterface.Basic;

public interface Greeting
{
    void wishMe();

    default void wishMeDefault(String str)
    {
        System.out.println(str);
    }

    static void wishMeStatic(String str)
    {
        System.out.println(str);
    }
}

package FunctionalInterface.Basic2;

public class Main
{
    public static void main(String[] args)
    {
        CheckNumber checkNumber = (a) -> a > 5 ? a : 0;
        System.out.println(checkNumber.checkGreaterThan5(2));
    }

}

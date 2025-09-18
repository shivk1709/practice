package FunctionalInterface.Situation2;

public class Main
{
    public static void main(String[] args)
    {
        Calculator<Integer, Integer> sum = Integer::sum;
        System.out.println(sum.calculate(10, 20));
    }
}

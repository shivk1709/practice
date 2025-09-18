package StringBuildervsBuffer;

public class StringBuilderExample extends Thread
{
    static StringBuilder sb = new StringBuilder();

    public void run()
    {
        for (int i = 1; i <= 100; i++)
        {
            sb.append("shiv");
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        StringBuilderExample t1 = new StringBuilderExample();
        StringBuilderExample t2 = new StringBuilderExample();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Result " + sb.reverse().toString() + " " + sb.toString().length());
    }
}

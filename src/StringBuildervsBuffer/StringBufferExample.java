package StringBuildervsBuffer;

public class StringBufferExample extends Thread
{
    static StringBuffer sb = new StringBuffer();

    public void run()
    {
        for(int i = 1; i <= 100; i++)
        {
            sb.append("B");
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        StringBufferExample t1 = new StringBufferExample();
        StringBufferExample t2 = new StringBufferExample();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Result " + sb.toString() + " " + sb.toString().length());

    }
}

package Abstraction.scenarios;

public class Paypal extends Payment
{
    public void processPayment(int money)
    {
        System.out.println("Processing Money with Paypal of " + money);
        System.out.println("Payment Done");
    }
}

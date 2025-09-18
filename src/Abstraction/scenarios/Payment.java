package Abstraction.scenarios;

public abstract class Payment
{
    int money;

    public void initiate()
    {
        System.out.println("Initiated the payment of " + money);
    }

    public void validate()
    {
        System.out.println("Details Validated");
    }

    public abstract void processPayment(int money);

}

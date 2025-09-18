package Abstraction.scenario3;

public class Delivery extends Notification implements DeliveryInterface
{
    public Delivery(String title, String message, String recipient)
    {
        super(title, message, recipient);
    }

    public void sendNotification()
    {
        System.out.println("Notification Sent to " + recipient + " With Delivery Channel " + getDeliveryChannel());
    }

    @Override
    public String getDeliveryChannel()
    {
        return "SMTP";
    }

    @Override
    public void send(Notification notification)
    {

    }
}

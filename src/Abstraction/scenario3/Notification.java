package Abstraction.scenario3;

public abstract class Notification
{
    String title;
    String message;
    String recipient;

    public Notification(String title, String message, String recipient)
    {
        this.title = title;
        this.message = message;
        this.recipient = recipient;
    }

    public void compose()
    {
        System.out.println("Message Composed with title " + title);
    }

    public abstract void sendNotification();

}

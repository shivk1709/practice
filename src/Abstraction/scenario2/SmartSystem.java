package Abstraction.scenario2;

public abstract class SmartSystem
{
    String device_name;

    public void turnOff()
    {
        System.out.println("TurnedOff the " + device_name);
    }

    public void turnOn()
    {
        System.out.println("TurnedOn the " + device_name);
    }

    public void connectWifi()
    {
        System.out.println("Connecting to Wifi");
        System.out.println("Connected SuccessFully");
    }

    public void reciveSoftwareUpdate()
    {
        System.out.println("Softwate Updates Available for " + device_name);
        System.out.println("Updated Successfully");
    }


}

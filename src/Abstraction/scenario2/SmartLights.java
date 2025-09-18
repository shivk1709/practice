package Abstraction.scenario2;

public class SmartLights extends SmartSystem implements SmartSystemInterface
{
    @Override
    public void changeColor(String colorName)
    {
        System.out.println("Changed Color of the " + device_name + " to " + colorName);
    }
}

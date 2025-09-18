package Abstraction.scenario2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        SmartLights light = new SmartLights();
        System.out.println("Enter the device name ");
        Scanner sc = new Scanner(System.in);
        light.device_name = sc.nextLine();
        light.turnOn();
        light.connectWifi();
        light.reciveSoftwareUpdate();
        light.changeColor("Red");
        light.turnOff();
    }
}

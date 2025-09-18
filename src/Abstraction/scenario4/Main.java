package Abstraction.scenario4;

public class Main
{
    public static void main(String[] args)
    {
        GasolineCar gasolineCar = new GasolineCar();
        gasolineCar.showFuel();
        gasolineCar.showData();
        System.out.println("isChargingStationAvailable " + gasolineCar.isChargingStationAvailable());
        System.out.println("Show battery Health " + gasolineCar.giveBatteryHealthInPercent());;
    }
}

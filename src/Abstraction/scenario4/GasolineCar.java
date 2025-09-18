package Abstraction.scenario4;

public class GasolineCar extends Dashboard implements GasolineInterface
{
    @Override
    public boolean isChargingStationAvailable()
    {
        return true;
    }

    @Override
    public double giveBatteryHealthInPercent()
    {
        return 50;
    }
}

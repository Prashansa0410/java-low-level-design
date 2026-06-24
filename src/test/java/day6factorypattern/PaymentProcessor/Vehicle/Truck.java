package day6factorypattern.PaymentProcessor.Vehicle;

public class Truck implements Vehicle{

    @Override
    public VehicleType getType() {
        return VehicleType.TRUCK;
    }
}

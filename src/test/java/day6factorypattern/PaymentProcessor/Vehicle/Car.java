package day6factorypattern.PaymentProcessor.Vehicle;

public class Car implements Vehicle{

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }
}

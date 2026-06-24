package day6factorypattern.PaymentProcessor.Vehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType type){
        switch(type){


            case CAR:
                return new Car();

            case TRUCK:
                return new Truck();

            case BIKE:
                return new Bike();

            default:
                throw new IllegalArgumentException();
        }

    }
}

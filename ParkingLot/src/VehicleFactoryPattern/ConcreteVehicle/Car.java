package VehicleFactoryPattern.ConcreteVehicle;

import FareStrategyPattern.ParkingLotPrice;
import VehicleFactoryPattern.Vehicle;

public class Car extends Vehicle {
    public Car(String plateNumber, String vehicleType, ParkingLotPrice parkingLotPrice) {
        super(plateNumber, vehicleType, parkingLotPrice);
    }
}

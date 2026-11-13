package VehicleFactoryPattern.ConcreteVehicle;

import FareStrategyPattern.ParkingLotPrice;
import VehicleFactoryPattern.Vehicle;

public class Bike extends Vehicle {
    public Bike(String plateNumber, String vehicleType, ParkingLotPrice parkingLotPrice) {
        super(plateNumber, vehicleType, parkingLotPrice);
    }
}

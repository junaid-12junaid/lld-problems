package ParkingSpots.ConcreteParkingSpots;

import ParkingSpots.ParkingSpots;
import VehicleFactoryPattern.Vehicle;

public class CarParkingSpot extends ParkingSpots {
    public CarParkingSpot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    @Override
    public Boolean canPark(Vehicle vehicle) {
        return vehicle.getVehicleType().toLowerCase().equals("car");
    }
}

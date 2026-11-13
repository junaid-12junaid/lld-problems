package ParkingSpots.ConcreteParkingSpots;

import ParkingSpots.ParkingSpots;
import VehicleFactoryPattern.Vehicle;

public class BikeParkingSpot extends ParkingSpots {
    public BikeParkingSpot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    @Override
    public Boolean canPark(Vehicle vehicle) {
        return vehicle.getVehicleType().toLowerCase().equals("bike");
    }
}

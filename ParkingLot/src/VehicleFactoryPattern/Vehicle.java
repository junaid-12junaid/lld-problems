package VehicleFactoryPattern;

import Enums.DurationTypes;
import FareStrategyPattern.ParkingLotPrice;

public abstract class Vehicle {
    public String plateNumber;
    public String vehicleType;
    public ParkingLotPrice parkingLotPrice;

    public Vehicle(String plateNumber, String vehicleType, ParkingLotPrice parkingLotPrice) {
        this.plateNumber = plateNumber;
        this.vehicleType = vehicleType;
        this.parkingLotPrice = parkingLotPrice;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
    public double calculateFee(int duration, DurationTypes durationType){
        return parkingLotPrice.calculatePrice(duration,durationType,vehicleType);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plateNumber='" + plateNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", parkingLotPrice=" + parkingLotPrice +
                '}';
    }
}

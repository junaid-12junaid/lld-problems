package VehicleFactoryPattern;

import FareStrategyPattern.ParkingLotPrice;
import VehicleFactoryPattern.ConcreteVehicle.Bike;
import VehicleFactoryPattern.ConcreteVehicle.Car;

public class VehicleFactory {
    public static Vehicle createVechile(String type,String plateNumber, String vehicleType, ParkingLotPrice parkingLotPrice){
        if(type.toLowerCase().equals("car")){
            return new Car(plateNumber,vehicleType,parkingLotPrice);
        }else if(type.toLowerCase().equals("bike")){
            return new Bike(plateNumber,vehicleType,parkingLotPrice);
        }else{
            throw  new IllegalArgumentException("there is no type of this vehicle");
        }
    }
}

package Controller;

import ParkingSpots.ParkingSpots;
import VehicleFactoryPattern.Vehicle;

import java.util.ArrayList;

public class ParkingLot {
    ArrayList<ParkingSpots> parkingSpots;
    static ParkingLot instance;

    public ParkingLot() {
        this.parkingSpots = new ArrayList<>();
    }
    public static ParkingLot getInstance(){
        if(instance==null){
            instance=new ParkingLot();
        }
        return instance;
    }

    public ArrayList<ParkingSpots> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(ParkingSpots parkingSpot) {
        this.parkingSpots.add(parkingSpot);
    }

    public ParkingSpots findAvailableSpot(String vehicleType){
        for(ParkingSpots p:parkingSpots){
            if(p.getSpotType().equals(vehicleType)&&!p.isOccupied){
              return p;
            }
        }
        return null;
    };

    public void vacateSpot(ParkingSpots parkingSpot){
        for(ParkingSpots p:parkingSpots){
            if(p==parkingSpot){
                p.vacate();
            }
        }
    }

    public ParkingSpots parkVehicle(Vehicle vehicle){
        ParkingSpots spot=findAvailableSpot(vehicle.getVehicleType());
        if(spot!=null){
            spot.parkVehicle(vehicle);
            System.out.println("this vehicle is parked"+vehicle);
            return spot;
        }
        return null;
    }

    public ArrayList<ParkingSpots> getSpots(){
        return parkingSpots;
    }

}

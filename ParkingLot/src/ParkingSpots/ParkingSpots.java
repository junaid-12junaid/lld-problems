package ParkingSpots;

import VehicleFactoryPattern.Vehicle;
import VehicleFactoryPattern.VehicleFactory;

public abstract class ParkingSpots {
    public int spotNumber;
    public Vehicle vehicle;
    public String spotType;
    public Boolean isOccupied;

    public ParkingSpots(int spotNumber, String spotType) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.isOccupied = false;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getSpotType() {
        return spotType;
    }

    public void setSpotType(String spotType) {
        this.spotType = spotType;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public abstract Boolean canPark(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle){
        if(isOccupied){
            throw new IllegalStateException("This Spot is already Occupied Sorry please choose different spot");
        }
        if(!canPark(vehicle)){
            throw new IllegalArgumentException("Sorry wrong spot can't park this vehicle here");
        }
        this.vehicle=vehicle;
        this.isOccupied=true;
    }

    public void vacate(){
        if(!isOccupied){
            throw new IllegalStateException("This Spot is already Vacated");
        }
    this.vehicle=null;
    this.isOccupied=false;
    }

    @Override
    public String toString() {
        return "ParkingSpots{" +
                "spotNumber=" + spotNumber +
                ", vehicle=" + vehicle +
                ", spotType='" + spotType + '\'' +
                ", isOccupied=" + isOccupied +
                '}';
    }
}

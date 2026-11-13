package FareStrategyPattern;

import Enums.DurationTypes;

public interface ParkingLotPrice {
    public double calculatePrice(int duration, DurationTypes durationType,String vehical);
}

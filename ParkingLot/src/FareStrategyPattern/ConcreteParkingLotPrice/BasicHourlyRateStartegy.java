package FareStrategyPattern.ConcreteParkingLotPrice;

import Enums.DurationTypes;
import FareStrategyPattern.ParkingLotPrice;

public class BasicHourlyRateStartegy implements ParkingLotPrice {
    @Override
    public double calculatePrice(int duration, DurationTypes durationType, String vehical) {
        if(vehical.toLowerCase().equals("car")){
            return durationType==DurationTypes.HOURS?duration*10:duration*20;
        }else if(vehical.toLowerCase().equals("bike")){
            return durationType==DurationTypes.HOURS?duration*5:duration*10;

        }else {
            throw new IllegalArgumentException("There is no vehicle of this type");
        }
    }
}

import Controller.ParkingLot;
import Enums.DurationTypes;
import FareStrategyPattern.ConcreteParkingLotPrice.BasicHourlyRateStartegy;
import ParkingSpots.ConcreteParkingSpots.BikeParkingSpot;
import ParkingSpots.ConcreteParkingSpots.CarParkingSpot;
import ParkingSpots.ParkingSpots;
import PaymentStrategyPattern.ConcretePayment.CardPayments;
import PaymentStrategyPattern.ConcretePayment.CashPayment;
import PaymentStrategyPattern.PaymentStrategy;
import VehicleFactoryPattern.ConcreteVehicle.Car;
import VehicleFactoryPattern.Vehicle;

import java.util.Scanner;

public class ParkingLotMain {
    public static void main(){
        BasicHourlyRateStartegy basicHourlyRateStartegy=new BasicHourlyRateStartegy();

        Vehicle car=new Car("123","car",basicHourlyRateStartegy);
        Vehicle bike=new Car("1234","bike",basicHourlyRateStartegy);
        ParkingLot parkingLot=ParkingLot.getInstance();
        parkingLot.setParkingSpots(new CarParkingSpot(1,"car"));
        parkingLot.setParkingSpots(new BikeParkingSpot(2,"bike"));
        parkingLot.setParkingSpots(new CarParkingSpot(3,"car"));
        parkingLot.setParkingSpots(new BikeParkingSpot(4,"bike"));
        ParkingSpots carSpot1= parkingLot.parkVehicle(car);
       ParkingSpots bikeSpot1= parkingLot.parkVehicle(bike);
        Scanner scanner=new Scanner(System.in);

       if(carSpot1!=null){
           double carPrice=carSpot1.vehicle.parkingLotPrice.calculatePrice(1, DurationTypes.HOURS,"car");
           System.out.println("please enter the Payment method for car parking");
          String input= scanner.nextLine();
           PaymentStrategy paymentStrategyCar=getPaymentStrategys(input);
           paymentStrategyCar.processPayment(carPrice);

           carSpot1.vacate();
       }
        if(bikeSpot1!=null){
            double bikePrice=bikeSpot1.vehicle.parkingLotPrice.calculatePrice(1, DurationTypes.HOURS,"bike");
            System.out.println("please enter the Payment method for bike parking");
            String input= scanner.nextLine();
            PaymentStrategy paymentStrategyCar=getPaymentStrategys(input);
            paymentStrategyCar.processPayment(bikePrice);

            bikeSpot1.vacate();
        }


        scanner.close();

    }
    public static PaymentStrategy getPaymentStrategys(String type){
        if(type.equals("cash")){
            return new CashPayment();
        }else if(type.equals("card")){
            return new CardPayments();
        }else{
            throw new IllegalArgumentException("there is no payment process for this except cash or Card");
        }
    }

}


package PaymentStrategyPattern.ConcretePayment;

import PaymentStrategyPattern.PaymentStrategy;

public class CardPayments implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing the Card Payment of "+amount);

    }
}

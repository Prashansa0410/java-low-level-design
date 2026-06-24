package day6factorypattern.PaymentProcessor.payment;

import day6factorypattern.PaymentProcessor.payment.PaymentProcess;
import day6factorypattern.PaymentProcessor.payment.PaymentTypes;

public class UpiProcessor implements PaymentProcess {
    @Override
    public PaymentTypes getType() {
        return PaymentTypes.UPI;
    }

    @Override
    public void processPayment(double amount) {

    }
}

package day6factorypattern.PaymentProcessor.payment;

public class CardProcessor implements PaymentProcess {

    @Override
    public PaymentTypes getType() {
        return PaymentTypes.CARD;
    }

    @Override
    public void processPayment(double amount) {

    }
}

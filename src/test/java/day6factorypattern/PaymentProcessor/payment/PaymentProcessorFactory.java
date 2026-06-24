package day6factorypattern.PaymentProcessor.payment;

public class PaymentProcessorFactory {

    public static PaymentProcess paymentProcess (PaymentTypes type) {
        switch (type) {
            case UPI:
                return new UpiProcessor();
            case CARD:
                return new CardProcessor();
            default:
                throw new IllegalArgumentException("Unsupported day6factorypattern.PaymentProcessor.Vehicle Type : " + type);
        }
    }
}

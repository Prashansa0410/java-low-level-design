package day6factorypattern.PaymentProcessor.payment;

public interface PaymentProcess {

    PaymentTypes getType();
    void processPayment(double amount);

}

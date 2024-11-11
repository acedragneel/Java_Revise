package patterns.behavioralpattern.strategy;

public interface PayStrategy {

    boolean pay(int paymentMethod);
    void collectionPaymentDetails();
}

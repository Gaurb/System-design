package Strategy;

// Concrete strategy for credit card payments
public class CreditCardStrategy implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("This is credit card payment strategy...");
    }
}

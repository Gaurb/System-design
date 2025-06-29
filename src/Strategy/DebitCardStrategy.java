package Strategy;

// Concrete strategy for debit card payments
public class DebitCardStrategy implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("This is debit card payment strategy...");
    }
}


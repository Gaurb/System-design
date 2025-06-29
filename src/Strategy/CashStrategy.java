package Strategy;

// Concrete strategy for cash payments
public class CashStrategy implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("This is cash payment strategy...");
    }
}

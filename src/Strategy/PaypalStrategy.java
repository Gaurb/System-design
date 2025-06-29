package Strategy;

// Concrete strategy for PayPal payments
public class PaypalStrategy implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("This is paypal  payment strategy...");
    }
}


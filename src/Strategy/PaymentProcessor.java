package Strategy;

// Context class - uses strategy pattern to delegate payment processing
public class PaymentProcessor {
    public PaymentStrategy paymentStrategy;

    // Constructor injection of strategy
    PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    
    // Delegates to the current strategy
    public void processPayment(){
        paymentStrategy.processPayment();
    }
    
    // Allows strategy to be changed at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}

package Strategy;

// Demonstrates the Strategy pattern for payment processing
public class Main {
    public static void main(String[] args) {
        // Create different payment strategies
        CreditCardStrategy creditCard= new CreditCardStrategy();
        DebitCardStrategy debitCard = new DebitCardStrategy();
        PaypalStrategy paypal= new PaypalStrategy();
        CashStrategy cash= new CashStrategy();

        // Initialize processor with credit card strategy
        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCard);

        paymentProcessor.processPayment();

        // Switch strategies at runtime
        paymentProcessor.setPaymentStrategy(debitCard);
        paymentProcessor.setPaymentStrategy(paypal);
        paymentProcessor.setPaymentStrategy(cash);
    }
}

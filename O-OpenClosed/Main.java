package O-OpenClosed;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        PaymentMethod creditCardPayment = new CreditCardPayment();
        paymentProcessor.processPayment(creditCardPayment);

        PaymentMethod payPalPayment = new PayPalPayment();
        paymentProcessor.processPayment(payPalPayment);

        // Para agregar un nuevo método de pago:
        PaymentMethod bitcoinPayment = new BitcoinPayment();
        paymentProcessor.processPayment(bitcoinPayment);
    }
}


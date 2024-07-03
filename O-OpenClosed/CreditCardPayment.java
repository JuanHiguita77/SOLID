package O-OpenClosed;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        // Lógica para procesar el pago con tarjeta de crédito
        System.out.println("Processing credit card payment");
    }
}


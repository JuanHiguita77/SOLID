package O-OpenClosed;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        // Lógica para procesar el pago con PayPal
        System.out.println("Processing PayPal payment");
    }
}

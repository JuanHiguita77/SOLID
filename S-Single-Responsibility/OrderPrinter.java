import java.util.List;

public class OrderPrinter {
        public void printOrder(Order order, double totalAmount) {
            // Lógica para imprimir la orden
            System.out.println("Items: " + order.getItems());
            System.out.println("Total Amount: " + totalAmount);
        }
}

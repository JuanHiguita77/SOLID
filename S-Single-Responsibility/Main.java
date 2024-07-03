import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = List.of("item1", "item2", "item3");
        Order order = new Order(items);

        OrderCalculator calculator = new OrderCalculator();
        double totalAmount = calculator.calculateTotal(order);

        OrderPrinter printer = new OrderPrinter();
        printer.printOrder(order, totalAmount);

        OrderRepository repository = new OrderRepository();
        repository.saveToDatabase(order);
    }
}

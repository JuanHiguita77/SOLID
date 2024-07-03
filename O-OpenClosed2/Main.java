package O-OpenClosed2;

public class Main {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        double usaTax = taxCalculator.calculateTax("USA");
        System.out.println("Tax for USA: " + usaTax);

        double ukTax = taxCalculator.calculateTax("UK");
        System.out.println("Tax for UK: " + ukTax);

        // Para agregar una nueva estrategia de impuestos:
        class CanadaTaxStrategy implements TaxStrategy {
            @Override
            public double calculateTax() {
                // Lógica para calcular el impuesto en Canadá
                return 0.15;
            }
        }
        
        taxCalculator.addTaxStrategy("Canada", new CanadaTaxStrategy());
        double canadaTax = taxCalculator.calculateTax("Canada");
        System.out.println("Tax for Canada: " + canadaTax);
    }
}


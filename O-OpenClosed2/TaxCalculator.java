package O-OpenClosed2;

import java.util.HashMap;
import java.util.Map;

public class TaxCalculator {
    private final Map<String, TaxStrategy> taxStrategies = new HashMap<>();

    public TaxCalculator() {
        taxStrategies.put("USA", new USATaxStrategy());
        taxStrategies.put("UK", new UKTaxStrategy());
    }

    public void addTaxStrategy(String country, TaxStrategy strategy) {
        taxStrategies.put(country, strategy);
    }

    public double calculateTax(String country) {
        TaxStrategy strategy = taxStrategies.get(country);
        if (strategy != null) {
            return strategy.calculateTax();
        }
        throw new IllegalArgumentException("No tax strategy found for country: " + country);
    }
}


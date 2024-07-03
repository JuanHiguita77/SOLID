package D-Dependency-Inversion;

public class PayrollService {
    public void calculatePay(Employee employee) {
        // Lógica para calcular el salario
        System.out.println("Calculating pay for: " + employee.getName());
    }
}


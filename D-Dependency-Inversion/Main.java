package D-Dependency-Inversion;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000);

        PayrollService payrollService = new PayrollService();
        payrollService.calculatePay(employee);

        EmployeeReport employeeReport = new EmployeeReport();
        employeeReport.generateReport(employee);

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.saveToDatabase(employee);
    }
}



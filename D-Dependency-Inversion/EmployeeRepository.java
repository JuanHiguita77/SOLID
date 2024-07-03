package D-Dependency-Inversion;

public class EmployeeRepository {
    public void saveToDatabase(Employee employee) {
        // Lógica para guardar el empleado en la base de datos
        System.out.println("Saving employee to database: " + employee.getName());
    }
}


package I-Interface-Segregation;

public class Database implements DataStorage {
    @Override
    public void save(String data) {
        // Lógica para guardar datos en la base de datos
        System.out.println("Data saved in the database: " + data);
    }
}


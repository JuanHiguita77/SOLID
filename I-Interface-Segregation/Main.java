package I-Interface-Segregation;

public class Main {
    public static void main(String[] args) {
        DataStorage database = new Database();
        DataService dataService = new DataService(database);

        dataService.saveData("Example data");
    }
}


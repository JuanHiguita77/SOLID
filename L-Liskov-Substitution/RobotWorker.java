package L-Liskov-Substitution;

public class RobotWorker implements Workable {
    @Override
    public void work() {
        // Lógica para trabajar
        System.out.println("Robot is working");
    }
}


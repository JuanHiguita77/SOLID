package L-Liskov-Substitution;

public class Main {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
        humanWorker.work();

        Eatable humanEater = (Eatable) humanWorker;
        humanEater.eat();

        Workable robotWorker = new RobotWorker();
        robotWorker.work();

        // Los robots no necesitan implementar el método `eat`
    }
}


package L-Liskov-Substitution;

public class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        // Lógica para trabajar
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        // Lógica para comer
        System.out.println("Human is eating");
    }
}


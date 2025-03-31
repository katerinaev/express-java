package practice_5.task_7;

public class Cow implements FarmAnimal {
    @Override
    public void care() {
        System.out.println("Cow grazing in a meadow");
    }

    @Override
    public void produce() {
        System.out.println("Cow gives milk");
    }
}

package practice_5.task_7;

public class Chicken implements FarmAnimal {
    @Override
    public void care() {
        System.out.println("Chicken pecks grain");
    }

    @Override
    public void produce() {
        System.out.println("Chicken lays eggs");
    }
}

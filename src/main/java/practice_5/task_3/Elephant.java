package practice_5.task_3;

public class Elephant extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The elephant trumpets");
    }

    @Override
    public void move() {
        System.out.println("The elephant walks");
    }
}

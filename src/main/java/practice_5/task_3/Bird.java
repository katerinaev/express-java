package practice_5.task_3;

public class Bird extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The bird tweets");
    }

    @Override
    public void move() {
        System.out.println("The bird flies");
    }
}

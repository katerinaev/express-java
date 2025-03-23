package practice_5.task_3;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }


    @Override
    void makeSound() {
        System.out.println("Слон " + getName() + " трубит.");
    }

    @Override
    void move() {
        System.out.println("Слон " + getName() + " идет.");
    }
}

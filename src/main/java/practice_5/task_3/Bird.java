package practice_5.task_3;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Птичка " + getName() + " чирикает.");
    }

    @Override
    void move() {
        System.out.println("Птичка " + getName() +  " летает.");
    }
}

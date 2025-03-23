package practice_5.task_4;

public class Cat extends Pet {
    public Cat(String name) {
        super(name, "влажный корм");
    }

    @Override
    public void act() {
        System.out.println("Кот играет");
    }
}

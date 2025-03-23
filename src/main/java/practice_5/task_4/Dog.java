package practice_5.task_4;

public class Dog extends Pet {
    public Dog(String name) {
        super(name, "сухой корм");
    }

    @Override
    public void act() {
        System.out.println("Сообака гуляет");
    }
}

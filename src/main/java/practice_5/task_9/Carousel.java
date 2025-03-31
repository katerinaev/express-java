package practice_5.task_9;

public class Carousel extends Attraction {
    @Override
    void info() {
        System.out.println("Carousel - attraction for entertainment");
    }

    @Override
    void maintenance() {
        System.out.println("Carousel needs maintenance");
    }
}

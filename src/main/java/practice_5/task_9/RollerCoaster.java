package practice_5.task_9;

public class RollerCoaster extends Attraction {
    @Override
    void info() {
        System.out.println("Roller coaster - attraction for brave");
    }

    @Override
    void maintenance() {
        System.out.println("Roller coaster requires safety inspection");
    }
}

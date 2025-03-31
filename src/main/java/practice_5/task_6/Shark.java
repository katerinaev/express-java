package practice_5.task_6;

public class Shark extends SeaCreature {

    @Override
    void act() {
        System.out.println("Shark behaves aggressively");
    }

    @Override
    void move() {
        System.out.println("Shark swims fast");
    }
}

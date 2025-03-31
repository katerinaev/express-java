package practice_5.task_6;

public class StarFish extends SeaCreature {
    @Override
    void act() {
        System.out.println("Starfish crawls along the bottom");
    }

    @Override
    void move() {
        System.out.println("Starfish moves slowly");
    }
}

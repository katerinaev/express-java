package practice_5.task_6;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        SeaCreature shark = new Shark();
        SeaCreature starFish = new StarFish();

        aquarium.setCreature(shark);
        aquarium.showCreature();

        aquarium.setCreature(starFish);
        aquarium.showCreature();
    }
}

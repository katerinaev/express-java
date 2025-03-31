package practice_5.task_6;

public class Aquarium {
    private SeaCreature creature;

    public void setCreature(SeaCreature creature) {
        this.creature = creature;
    }

    public void showCreature() {
        creature.act();
        creature.move();
    }
}

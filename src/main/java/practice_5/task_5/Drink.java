package practice_5.task_5;

public class Drink extends Dish {
    private int volume;

    public Drink(String name, int volume) {
        super(name);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", volume " + getVolume() + " ml";
    }
}

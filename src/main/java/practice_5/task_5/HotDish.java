package practice_5.task_5;

public class HotDish extends Dish {
    private int temperature;

    public HotDish(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", temperature " + getTemperature();
    }
}

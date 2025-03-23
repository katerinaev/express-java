package practice_5.task_5;

public class HotDish extends Dish {
    private double temperature;

    public HotDish(String name, double price) {
        super(name, price);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", temperature " + this.temperature);
    }
}

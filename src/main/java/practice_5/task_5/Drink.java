package practice_5.task_5;

public class Drink extends Dish {
    private double volume;

    public Drink(String name, double price) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", volume " + this.volume);
    }
}

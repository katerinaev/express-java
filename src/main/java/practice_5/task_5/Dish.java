package practice_5.task_5;

public class Dish implements Printable {
    private String name;
    private double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print("\n" + "The dish: name " + this.name + ", price " + this.price);
    }
}

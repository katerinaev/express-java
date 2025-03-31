package practice_5.task_5;

public class Dish implements Describable {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return  "The dish: name " + getName();
    }
}

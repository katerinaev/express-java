package practice_5.task_4;

public abstract class Pet {
    private String name;
    private String food;

    public Pet(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return this.name;
    }

    public String getFood() {
        return this.food;
    }

    public abstract void act();

    public void eat() {
        System.out.println(name + " ест " + food);
    };
}

package practice_5.task_5;

public class Menu {
    private Dish dish;

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public void printDish() {
        System.out.println(dish.getDescription());
    }
}

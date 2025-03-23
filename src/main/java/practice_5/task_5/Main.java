package practice_5.task_5;

public class Main {
    public static void main(String[] args) {
        Dish dish = new Dish("Caesar salad", 25.0);
        Dish soup = new HotDish("Harcho", 15.0);
        Dish smuzi = new Drink("Smuzi", 7.0);

        Administrator igor = new Administrator();

        igor.administer(dish);
        igor.administer(soup);
        igor.administer(smuzi);
    }
}

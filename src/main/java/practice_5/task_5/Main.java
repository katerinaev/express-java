package practice_5.task_5;

public class Main {
    public static void main(String[] args) {
        Dish salad = new Dish("Caesar salad");
        Dish soup = new HotDish("Harcho", 65);
        Dish smuzi = new Drink("Smuzi", 250);

        Menu menu = new Menu();

        menu.setDish(salad);
        menu.printDish();
        menu.setDish(soup);
        menu.printDish();
        menu.setDish(smuzi);
        menu.printDish();
    }
}

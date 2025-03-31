package practice_5.task_7;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.setAnimal(new Cow());
        System.out.println("There is a cow on the farm");
        farm.manageAnimal();

        farm.setAnimal(new Chicken());
        System.out.println("There's a chicken on the farm");
        farm.manageAnimal();
    }
}

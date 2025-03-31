package practice_5.task_3;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal animal1 = new Elephant();
        Animal animal2 = new Bird();

        zoo.setAnimal(animal1);
        zoo.showAnimal(animal2);
    }
}

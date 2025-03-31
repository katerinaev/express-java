package practice_5.task_3;

public class Zoo {
    private Animal animal;
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showAnimal(Animal animal) {
        animal.makeSound();
        animal.move();
    }
}

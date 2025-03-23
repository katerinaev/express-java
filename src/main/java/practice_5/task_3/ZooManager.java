package practice_5.task_3;

import java.util.ArrayList;
import java.util.List;

public class ZooManager {
    protected List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Добавлено животное: " + animal.getName());
    }

    public void printMakeSound(Animal animal) {
        System.out.print("Животное издает звук: ");
        animal.makeSound();
    }

    public void printMove(Animal animal) {
        System.out.print("Животное двигается: ");
        animal.move();
    }

    public void printAnimals() {
        System.out.println("Животные в зоопарке: ");
        for (Animal animal : animals) {
            System.out.println("- " + animal.getName());
        }
    }
}

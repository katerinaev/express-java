package practice_5.task_4;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat("Василий");
        Pet dog = new Dog("Барбос");

        PetOwner petOwner = new PetOwner();

        petOwner.feedPet(cat);
        petOwner.feedPet(dog);

        petOwner.actPet(cat);
        petOwner.actPet(dog);
    }
}

package practice_5.task_7;

public class Farm {
    private FarmAnimal animal;

    public void setAnimal(FarmAnimal animal) {
        this.animal = animal;
    }

    public void manageAnimal() {
        animal.care();
        animal.produce();
    }
}

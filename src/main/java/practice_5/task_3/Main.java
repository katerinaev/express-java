package practice_5.task_3;

public class Main {
    public static void main(String[] args) {
        Animal elephant1 = new Elephant("Фунтик");
        Animal elephant2 = new Elephant("Дамбо");
        Animal bird1 = new Bird("Тари");
        Animal bird2 = new Bird("Чик-Чирик");

        ZooManager zooManager = new ZooManager();

        zooManager.addAnimal(bird1);
        zooManager.addAnimal(bird2);
        zooManager.addAnimal(elephant1);
        zooManager.addAnimal(elephant2);

        zooManager.printMakeSound(elephant1);
        zooManager.printMove(elephant2);

        zooManager.printMakeSound(bird1);
        zooManager.printMove(bird2);

        zooManager.printAnimals();
    }
}

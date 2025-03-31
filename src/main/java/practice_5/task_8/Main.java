package practice_5.task_8;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden garden = new BotanicalGarden();

        Plant orchid = new Orchid();
        garden.setPlant(orchid);
        garden.careOfPlant();

        Plant cactus = new Cactus();
        garden.setPlant(cactus);
        garden.careOfPlant();
    }
}

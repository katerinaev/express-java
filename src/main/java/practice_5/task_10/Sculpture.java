package practice_5.task_10;

public class Sculpture implements Exhibit {
    @Override
    public void history() {
        System.out.println("Describes sculpture history");
    }

    @Override
    public void conditions() {
        System.out.println("Storage conditions: needs restoration");
    }
}

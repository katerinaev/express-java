package practice_5.task_10;

public class Manuscript implements Exhibit {
    @Override
    public void history() {
        System.out.println("Describes manuscript history");
    }

    @Override
    public void conditions() {
        System.out.println("Storage conditions: requires controlled humidity");
    }
}

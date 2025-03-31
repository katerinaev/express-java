package practice_5.task_10;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        Exhibit manuscript = new Manuscript();
        museum.setExhibit(manuscript);
        museum.manageExhibit();

        Exhibit sculpture = new Sculpture();
        museum.setExhibit(sculpture);
        museum.manageExhibit();
    }
}

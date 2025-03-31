package practice_5.task_9;

public class Main {
    public static void main(String[] args) {
        RollerCoaster coaster = new RollerCoaster();
        Carousel carousel = new Carousel();

        AmusementPark park = new AmusementPark();
        park.setAttraction(coaster);
        park.showAttractionInfo();

        park.setAttraction(carousel);
        park.showAttractionInfo();
    }
}

package practice_5.task_9;

public class Main {
    public static void main(String[] args) {
        Attraction coaster = new RollerCoaster();
        Attraction carousel = new Carousel();

        AmusementPark park = new AmusementPark();
        park.setAttraction(coaster);
        park.showAttractionInfo();

        park.setAttraction(carousel);
        park.showAttractionInfo();
    }
}

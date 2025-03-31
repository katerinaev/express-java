package practice_5.task_9;

public class AmusementPark {
    private Attraction attraction;

    void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    void showAttractionInfo() {
        attraction.info();
        attraction.maintenance();
    }
}

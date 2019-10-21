package by.svetilnik.epam.d_classes.simpleClasses.task9;

public class PublishingHouse {
    private int id;
    private String namePublishingHouse;

    public PublishingHouse(int id, String namePublishingHouse) {
        this.id = id;
        this.namePublishingHouse = namePublishingHouse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNamePublishingHouse(String namePublishingHouse) {
        this.namePublishingHouse = namePublishingHouse;
    }

    public String getNamePublishingHouse() {
        return namePublishingHouse;
    }
}

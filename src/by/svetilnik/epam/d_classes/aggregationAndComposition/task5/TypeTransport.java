package by.svetilnik.epam.d_classes.aggregationAndComposition.task5;

public enum TypeTransport {
    BUS("Автобус"),
    SHIP("Корабль"),
    TRAIN("Поезд"),
    PLANE("Самолет"),
    CAR("Машина");

    private String title;

    TypeTransport(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TypeTransport{" +
                "title='" + title + '\'' +
                '}';
    }
}

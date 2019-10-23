package by.svetilnik.epam.d_classes.simpleClasses.task10;

public class Destination {
    private int id;
    private String nameDestination;

    public Destination(int id, String nameDestination) {
        this.id = id;
        this.nameDestination = nameDestination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDestination() {
        return nameDestination;
    }

    public void setNameDestination(String nameDestination) {
        this.nameDestination = nameDestination;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "id=" + id +
                ", nameDestination='" + nameDestination + '\'' +
                '}';
    }
}

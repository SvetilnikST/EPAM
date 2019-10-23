package by.svetilnik.epam.d_classes.simpleClasses.task8.logic;

public class Street {
    private int id;
    private String nameStreet;

    public Street(int id, String nameStreet) {
        this.id = id;
        this.nameStreet = nameStreet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameStreet() {
        return nameStreet;
    }

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    @Override
    public String toString() {
        return "Street{" +
                "id=" + id +
                ", nameStreet=" + nameStreet +
                '}';
    }
}

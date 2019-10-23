package by.svetilnik.epam.d_classes.simpleClasses.task8.logic;

public class City {
    private int id;
    private String nameCity;

    public City(int id, String nameCity) {
        this.id = id;
        this.nameCity = nameCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", nameCity='" + nameCity + '\'' +
                '}';
    }
}

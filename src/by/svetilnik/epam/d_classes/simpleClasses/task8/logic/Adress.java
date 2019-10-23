package by.svetilnik.epam.d_classes.simpleClasses.task8.logic;

public class Adress {
    private int id;
    private City city;
    private Street street;
    private String numberHouse;
    private String numberFlat;

    public Adress(int id, City city, Street street, String numberHouse, String numberFlat) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.numberHouse = numberHouse;
        this.numberFlat = numberFlat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(String numberFlat) {
        this.numberFlat = numberFlat;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "id=" + id +
                ", city=" + city +
                ", street=" + street +
                ", numberHouse='" + numberHouse + '\'' +
                ", numberFlat='" + numberFlat + '\'' +
                '}';
    }
}

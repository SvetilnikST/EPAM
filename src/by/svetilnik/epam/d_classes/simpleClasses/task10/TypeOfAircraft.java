package by.svetilnik.epam.d_classes.simpleClasses.task10;

public class TypeOfAircraft {
    private int id;
    private String nameTypeAircraft;

    public TypeOfAircraft(int id, String nameTypeAircraft) {
        this.id = id;
        this.nameTypeAircraft = nameTypeAircraft;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTypeAircraft() {
        return nameTypeAircraft;
    }

    public void setNameTypeAircraft(String nameTypeAircraft) {
        this.nameTypeAircraft = nameTypeAircraft;
    }

    @Override
    public String toString() {
        return "TypeOfAircraft{" +
                "id=" + id +
                ", nameTypeAircraft='" + nameTypeAircraft + '\'' +
                '}';
    }
}

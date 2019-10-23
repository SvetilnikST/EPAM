package by.svetilnik.epam.d_classes.simpleClasses.task10;

public class Airline {
    private int id;
    private Destination destination;
    private int numberFlight;
    private TypeOfAircraft typeOfAircraft;
    private String time;
    private DayOfTheWeek dayOfTheWeek;

    public Airline(int id, Destination destination, int numberFlight, TypeOfAircraft typeOfAircraft, String time, DayOfTheWeek dayOfTheWeek) {
        this.id = id;
        this.destination = destination;
        this.numberFlight = numberFlight;
        this.typeOfAircraft = typeOfAircraft;
        this.time = time;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public int getNumberFlight() {
        return numberFlight;
    }

    public void setNumberFlight(int numberFlight) {
        this.numberFlight = numberFlight;
    }

    public TypeOfAircraft getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(TypeOfAircraft typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public DayOfTheWeek getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(DayOfTheWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "id=" + id +
                ", destination=" + destination +
                ", numberFlight=" + numberFlight +
                ", typeOfAircraft=" + typeOfAircraft +
                ", time='" + time + '\'' +
                ", dayOfTheWeek=" + dayOfTheWeek +
                '}';
    }
}

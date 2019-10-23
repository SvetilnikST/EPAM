package by.svetilnik.epam.d_classes.simpleClasses.task10;

import java.util.ArrayList;

public class AirlinesList {
    private ArrayList<Airline> airline;

    public AirlinesList() {
    }

    public AirlinesList(ArrayList<Airline> airline) {
        this.airline = airline;
    }

    public ArrayList<Airline> getAirline() {
        return airline;
    }

    public void setAirline(ArrayList<Airline> airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "AirlinesList{" +
                "airline=" + airline +
                '}';
    }
}

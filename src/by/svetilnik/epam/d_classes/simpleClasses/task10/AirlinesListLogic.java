package by.svetilnik.epam.d_classes.simpleClasses.task10;

import java.util.ArrayList;

public class AirlinesListLogic {

    public static AirlinesList fillAirlinesList(AirlinesList airlinesList) {

        Destination paris = new Destination(1, "Paris");
        TypeOfAircraft normal = new TypeOfAircraft(1, "normal");

        ArrayList<Airline> airlines = new ArrayList<>();
        Airline airlineOne = new Airline(1, paris, 555, normal, "10", DayOfTheWeek.MONDAY);
        Airline airlineTwo = new Airline(1, paris, 111, normal, "10", DayOfTheWeek.FRIDAY);

        airlines.add(airlineOne);
        airlines.add(airlineTwo);

        airlinesList.setAirline(airlines);

        return airlinesList;
    }

    public static AirlinesList findDay(AirlinesList airlinesList, DayOfTheWeek dayOfTheWeek) {

        ArrayList<Airline> airlines = new ArrayList<>();

        for (int i = 0; i < airlinesList.getAirline().size(); i++) {
            if (airlinesList.getAirline().get(i).getDayOfTheWeek() == dayOfTheWeek) {
                airlines.add(airlinesList.getAirline().get(i));
            }
        }
        airlinesList.setAirline(airlines);

        return airlinesList;
    }

    public static AirlinesList findDestination(AirlinesList airlinesList, Destination destination) {

        ArrayList<Airline> airlines = new ArrayList<>();

        for (int i = 0; i < airlinesList.getAirline().size(); i++) {
            if (airlinesList.getAirline().get(i).getDestination().getId() == destination.getId()) {
                airlines.add(airlinesList.getAirline().get(i));
            }
        }

        airlinesList.setAirline(airlines);
        return airlinesList;
    }


    public static AirlinesList findDayTime(AirlinesList airlinesList, DayOfTheWeek dayOfTheWeek, String time) {

        ArrayList<Airline> airlines = new ArrayList<>();

        for (int i = 0; i < airlinesList.getAirline().size(); i++) {
            if ((airlinesList.getAirline().get(i).getDayOfTheWeek() == dayOfTheWeek) && (airlinesList.getAirline().get(i).getTime() == time)) {
                airlines.add(airlinesList.getAirline().get(i));
            }
        }

        airlinesList.setAirline(airlines);
        return airlinesList;
    }


}

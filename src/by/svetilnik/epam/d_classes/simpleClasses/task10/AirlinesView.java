package by.svetilnik.epam.d_classes.simpleClasses.task10;

public class AirlinesView {
    public static void printAirlines(AirlinesList airlinesList){
        for (int i = 0; i < airlinesList.getAirline().size(); i++) {
            System.out.println(airlinesList.getAirline().get(i).toString());
        }
    }
}

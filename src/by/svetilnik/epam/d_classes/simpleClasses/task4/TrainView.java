package by.svetilnik.epam.d_classes.simpleClasses.task4;

import java.util.List;

public class TrainView {

    public static void printTrain(List<Train> trains) {
        for (Train train : trains) {
            System.out.println(
                    train.getNameDestination() + ":" +
                            train.getNumberTrain() + " - " +
                            train.getDepartureTime().toString()
            );
        }
    }

}

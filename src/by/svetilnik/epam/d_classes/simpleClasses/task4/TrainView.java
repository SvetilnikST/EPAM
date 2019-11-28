package by.svetilnik.epam.d_classes.simpleClasses.task4;

import java.util.ArrayList;
import java.util.List;

public class TrainView {

    public static void printTrains(List<Train> trains) {
        for (Train train : trains) {
            System.out.println(
                    train.getNameDestination() + ":" +
                            train.getNumberTrain() + " - " +
                            train.getDepartureTime().toString()
            );
        }
    }

    public static void printInfoTrain(Train train) {

        System.out.println("Name destination: " +
                train.getNameDestination() +
                "Number: " +
                train.getNumberTrain() + " - " +
                "Time" + " " +
                train.getDepartureTime().toString()
        );

    }

    public static void printInfo(ArrayList<Train> trains, int number) {
        int count = 0;

        for (Train train : trains) {

            if (number == train.getNumberTrain()) {
                System.out.println("Info about train number" + " " + number + " ");
                printInfoTrain(train);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found train with number" + number);
        }
    }

}

package by.svetilnik.epam.d_classes.simpleClasses.task4;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TrainLogic {

    public static ArrayList<Train> fillTrains(ArrayList<Train> trains) {
        trains.add(new Train("five", 5, LocalTime.of(5, 0)));
        trains.add(new Train("one", 1, LocalTime.of(4, 50)));
        trains.add(new Train("tree", 3, LocalTime.of(10, 35)));
        trains.add(new Train("one", 2, LocalTime.of(7, 30)));
        trains.add(new Train("four", 4, LocalTime.of(1, 30)));
        return trains;
    }


    //сортировка поездов по пункту назначения в алфавитном порядке
    public static ArrayList<Train> sortTrainForNameDestination(ArrayList<Train> trains) {
        if (trains.size() > 0) Collections.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(final Train o1, final Train o2) {
                if (o1.getNameDestination() == o2.getNameDestination()) {
                    //сортировка по времени отправления
                    return o1.getDepartureTime().compareTo(o2.getDepartureTime());
                } else
                    return o1.getNameDestination().compareTo(o2.getNameDestination());
            }
        });
        return trains;
    }

    //сортировка по номерам поездов
    public static ArrayList<Train> sortTrainForNumber(ArrayList<Train> trains) {
        if (trains.size() > 0) Collections.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(final Train o1, final Train o2) {
                if (o1.getNumberTrain() > o2.getNumberTrain()) {
                    return 1;
                } else if (o1.getNumberTrain() < o2.getNumberTrain()) {
                    return -1;
                } else
                    return 0;
            }
        });
        return trains;
    }


}

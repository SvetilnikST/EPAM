package by.svetilnik.epam.d_classes.simpleClasses.task4;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TrainLogic {

    public static ArrayList<Train> fillTrains(ArrayList<Train> trains) {
        trains.add(new Train("five", 5, LocalTime.of(5, 0)));
        trains.add(new Train("one", 1, LocalTime.of(4, 50)));
        trains.add(new Train("tree", 3, LocalTime.of(10, 35)));
        trains.add(new Train("two", 2, LocalTime.of(7, 30)));
        trains.add(new Train("four", 4, LocalTime.of(1, 30)));
        return trains;
    }


    //сортировка поездов по номерам
    public static List<Train> sortTrainForNumbers(List<Train> trains) {
        Train min = trains.get(0);
        int minNum = 0;
        List<Train> rez = new ArrayList<>(trains.size());

        for (int i = 0; i < trains.size(); i++) {
            if (trains.get(i).getNumberTrain() < min.getNumberTrain()) {
//                Train tmp = trains.get(i);
//                trains.set(i, min);
//                trains.set(minNum, tmp);
//                minNum = i;



            }
        }

        return trains;
    }


}

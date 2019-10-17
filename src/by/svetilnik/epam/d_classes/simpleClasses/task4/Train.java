package by.svetilnik.epam.d_classes.simpleClasses.task4;

import java.time.LocalTime;

public class Train {
    private String nameDestination;
    private int numberTrain;
    private LocalTime departureTime;

    public Train() {
    }

    public Train(String nameDestination, int numberTrain, LocalTime departureTime) {
        this.nameDestination = nameDestination;
        this.numberTrain = numberTrain;
        this.departureTime = departureTime;
    }

    public String getNameDestination() {
        return nameDestination;
    }

    public void setNameDestination(String nameDestination) {
        this.nameDestination = nameDestination;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

}

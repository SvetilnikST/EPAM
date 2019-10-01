package com.svetilnik.classes.simpleClasses.task4;

import java.util.Date;

public class Train {
    private String nameDestination;
    private int numberTrain;
    private Date departureTime;

    public Train() {
    }

    public Train(String nameDestination, int numberTrain, Date departureTime) {
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

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
}

package com.svetilnik.classes.aggregationAndComposition.task2;

public class Car extends Engine {
    private String mark;
    private int gaselineVolume;
    private Wheels wheels;

    public Car() {
    }

    public Car(String mark, int gaselineVolume, Wheels wheels) {
        this.mark = mark;
        this.gaselineVolume = gaselineVolume;
        this.wheels = wheels;
    }

    //ехать
    private void go() {

    }

    //заправлять машину
    private void fuelTheCar() {

    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setGaselineVolume(int gaselineVolume) {
        this.gaselineVolume = gaselineVolume;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }
}

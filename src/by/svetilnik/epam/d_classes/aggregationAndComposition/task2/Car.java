package by.svetilnik.epam.d_classes.aggregationAndComposition.task2;

import java.util.ArrayList;

public class Car {
    private String mark;
    private Engine engineCar;
    private ArrayList<Wheel> wheels;
    //объем бака
    private int volumeGasTank;
    //наполненность
    private int amountGas;

    public Car(String mark, Engine engineCar, ArrayList<Wheel> wheels, int volumeGasTank, int amountGas) {
        this.mark = mark;
        this.engineCar = engineCar;
        this.wheels = wheels;
        this.volumeGasTank = volumeGasTank;
        this.amountGas = amountGas;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Engine getEngineCar() {
        return engineCar;
    }

    public void setEngineCar(Engine engineCar) {
        this.engineCar = engineCar;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public int getVolumeGasTank() {
        return volumeGasTank;
    }

    public void setVolumeGasTank(int volumeGasTank) {
        this.volumeGasTank = volumeGasTank;
    }

    public int getAmountGas() {
        return amountGas;
    }

    public void setAmountGas(int amountGas) {
        this.amountGas = amountGas;
    }

    //заправляться
    public void fillTheCar(Car car, int countGas) {

        System.out.println("Заправляем машину ...");

        int count = this.getVolumeGasTank() - this.getAmountGas();

        if (countGas <= count) {
            System.out.println("В баке" + " " + this.getAmountGas());
            System.out.println("Заправили" + " " + countGas);
            this.setAmountGas(countGas);
        } else {
            System.out.println("Из " + countGas + " заправили" + " " + count);
            this.setAmountGas(count);
        }
        System.out.println();
    }

    //ехать
    public void runCar() {

        System.out.println("Заводим машину...");
        if (this.amountGas == 0 && this.getWheels().size() != 0) {
            System.out.println("Пустой бак.");
        } else {
            System.out.println("Запускаем двигатель...");
            this.getEngineCar().runEngine();
            System.out.println("Машина едет!");
        }
        System.out.println();
    }

    //вывод марки авто
    public void prinMark() {
        System.out.println("Марка" + " " + this.getMark());
    }

    //замена колеса
    public void replaceWheel(int numberWheel, Wheel wheel) {

        System.out.println("Меняем колесо " + numberWheel);
        printWheels();
        this.getWheels().set(numberWheel, wheel);
        printWheels();
    }


    public void printWheels() {
        for (int i = 0; i < this.getWheels().size(); i++) {
            System.out.println(i + " " + this.getWheels().get(i).getMark() + " " + this.getWheels().get(i).getDiameter());
        }
        System.out.println();
    }

}

package by.svetilnik.epam.d_classes.aggregationAndComposition.task2;

public class Car {
    private String mark;
    //у машины есть конкретный двигатель - отношение типа "Композиция"
    private Engine engineCar;

    private Wheel wheelCar;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void prinMark() {
        System.out.println("Марка" + " " + this.getMark());
    }

    //установим машине двигатель
    public void setEngineCar(Engine engineCar) {
        this.engineCar = engineCar;
    }

    public Engine getEngineCar() {
        return engineCar;
    }

    public Car(String mark, Engine engine) {
        this.mark = mark;
        this.engineCar = engine;
    }

    public static void runCar(Car car){
        car.getEngineCar().runEngine();
    }

    public Wheel getWheelCar() {
        return wheelCar;
    }

    public void setWheelCar(Wheel wheelCar) {
        this.wheelCar = wheelCar;
    }

    public void setCountWheel(Car car){
    //вот сюда
    }
}

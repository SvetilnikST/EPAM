package by.svetilnik.epam.d_classes.aggregationAndComposition.task2;

public class Car {
    private String mark;

    //у машины есть конкретный двигатель
    private Engine engine;

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
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static void createCar(Car car) {

        //установили марку машины
        car.setMark("BMV");

        //создаем обычный двигатель
        Engine engine = new Engine();
        engine.setEngine("usual");

        //установили машине двигатель
        car.setEngine(engine);

    }

}

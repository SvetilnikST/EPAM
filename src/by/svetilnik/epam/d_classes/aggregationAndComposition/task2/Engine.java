package by.svetilnik.epam.d_classes.aggregationAndComposition.task2;

public class Engine {

    private String engine = "usual";

    public Engine() {
    }

    public Engine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void runEngine() {
        System.out.println("Двигатель " + this.getEngine() + " запущен.");
    }

}

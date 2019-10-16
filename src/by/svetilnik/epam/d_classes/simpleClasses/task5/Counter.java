package by.svetilnik.epam.d_classes.simpleClasses.task5;

public class Counter {
    private final int min = 0;
    private final int max = 10;
    private final int step = 1;

    private int current = 0;

    public Counter() {
    }

    public Counter(int current) {
        this.current = current;
    }

    public boolean add() {
        if (this.current < max) {
            this.current += step;
        } else return false;
        return true;
    }

    public boolean reduce() {
        if (this.current > min) {
            this.current -= step;
        } else return false;
        return true;
    }

    public int getCurrent() {
        return current;
    }
}

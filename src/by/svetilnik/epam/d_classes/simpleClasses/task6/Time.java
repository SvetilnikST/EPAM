package by.svetilnik.epam.d_classes.simpleClasses.task6;

public class Time {
    public static final int maxHour = 23;
    public static final int maximum = 60;
    public static final int minimum = 0;

    private int hour;
    private int minutes;
    private int second;

    public Time() {
        this.hour = minimum;
        this.minutes = minimum;
        this.second = minimum;
    }

    public Time(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > maxHour || hour < minimum) {
            this.hour = minimum;
        } else
            this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {

        if (minutes > maximum || minutes < minimum) {
            this.minutes = minimum;
        } else
            this.minutes = minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > maximum || second < minimum) {
            this.second = minimum;
        } else
            this.second = second;
    }

    public static void printTime(Time time) {
        System.out.println(
                "Time{" +
                        "hour=" + time.getHour() +
                        ", minutes=" + time.getMinutes() +
                        ", second=" + time.getSecond() +
                        '}');
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minutes=" + minutes +
                ", second=" + second +
                '}';
    }
}

package by.svetilnik.epam.d_classes.simpleClasses.task6;

public class Time {
    public static final int maxHour = 23;
    public static final int maxMinSec = 60;
    public static final int min = 0;

    private int hour;
    private int minutes;
    private int second;

    public Time() {
        this.hour = min;
        this.minutes = min;
        this.second = min;
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
        if (hour > maxHour || hour < min) {
            this.hour = min;
        } else
            this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {

        if (minutes > maxMinSec || minutes < min) {
            this.minutes = min;
        } else
            this.minutes = minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > maxMinSec || second < min) {
            this.second = min;
        } else
            this.second = second;
    }

    public static String printTime(Time time) {
        return "Time{" +
                "hour=" + time.getHour() +
                ", minutes=" + time.getMinutes() +
                ", second=" + time.getSecond() +
                '}';
    }
}

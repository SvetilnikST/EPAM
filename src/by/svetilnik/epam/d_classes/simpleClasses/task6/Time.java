package by.svetilnik.epam.d_classes.simpleClasses.task6;

public class Time {
    public static final int maxHour = 23;
    public static final int maxMinuteSec = 60;
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

        if (minutes > maxMinuteSec || minutes < min) {
            this.minutes = min;
        } else
            this.minutes = minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > maxMinuteSec || second < min) {
            this.second = min;
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

package by.svetilnik.epam.d_classes.simpleClasses.task6;

public class TimeLogic {

    public static Time setTimes(Time time, int hour, int minutes, int second) {
        time.setHour(hour);
        time.setMinutes(minutes);
        time.setSecond(second);
        return time;
    }

    public static Time replacePlusHour(Time time, int hour) {

        if (time.getHour() + hour > Time.maxHour) {
            time.setHour(Time.min);
        } else if (time.getHour() + hour < Time.maxHour) {
            time.setHour(time.getHour() + hour);
        }
        return time;
    }

    public static Time replaceMinusHour(Time time, int hour) {

        if (time.getHour() - hour > Time.maxHour || time.getHour() - hour < Time.min) {
            time.setHour(Time.min);
        } else if (time.getHour() - hour < Time.maxHour) {
            time.setHour(time.getHour() - hour);
        }
        return time;
    }

    public static Time replaceMinusMinute(Time time, int minutes) {

        int rez = time.getMinutes() - minutes; //0-120 = -120

        if (rez > Time.maxMinSec) {
            time.setMinutes(Time.min);
        } else if (rez < Time.maxMinSec && rez > Time.min) {
            time.setMinutes(rez);
        } else if (rez < Time.min) {
            int count = 1;
            int k = rez * (-1);
            while (k >Time.maxMinSec) {
                k = k - Time.maxMinSec;
                count++;
            }
            Time hour = replaceMinusHour(time, count);
            int minute = Time.maxMinSec-k;
            time.setHour(hour.getHour());
            time.setMinutes(minute);


        }
        return time;
    }

}

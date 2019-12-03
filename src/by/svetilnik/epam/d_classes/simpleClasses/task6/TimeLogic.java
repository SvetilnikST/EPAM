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
            time.setHour(Time.minimum);
        } else {
            time.setHour(time.getHour() + hour);
        }
        return time;
    }

    public static Time replaceMinusHour(Time time, int hour) {

        if (time.getHour() - hour < Time.minimum) {
            time.setHour(Time.minimum);
        } else if (time.getHour() - hour >= Time.minimum && time.getHour() - hour <= Time.maxHour) {
            time.setHour(time.getHour() - hour);
        }
        return time;
    }

    public static Time replaceMinusMinute(Time time, int minutes) {

        int rez = time.getMinutes() - minutes;
        if (rez > Time.maximum) {
            time.setMinutes(Time.minimum);
        } else if (rez < Time.maximum && rez > Time.minimum) {
            time.setMinutes(rez);
        } else if (rez < Time.minimum) {
            int count = 1;
            int k = rez * (-1);
            while (k > Time.maximum) {
                k = k - Time.maximum;
                count++;
            }
            Time hour = replaceMinusHour(time, count);
            int minute = Time.maximum - k;
            time.setHour(hour.getHour());
            time.setMinutes(minute);
        }
        return time;
    }

    public static Time replacePlusMinutes(Time time, int minutes) {
        int rez = time.getMinutes() + minutes;

        if (rez < Time.minimum) {
            time.setMinutes(Time.minimum);
        } else if (rez > Time.maximum) {
            int count = 0;
            while (rez >= Time.maximum) {
                rez = rez - Time.maximum;
                count++;
            }
            Time hour = replacePlusHour(time, count);
            time.setHour(hour.getHour());
            time.setMinutes(rez);
        } else {
            time.setMinutes(rez);
        }
        return time;
    }

    public static Time replacePlusSeconds(Time time, int secunds) {

        int rez = time.getSecond() + secunds;
        if (rez < Time.minimum) {
            time.setMinutes(Time.minimum);
        } else if (rez > Time.maximum) {
            int count = 0;
            while (rez >= Time.maximum) {
                rez = rez - Time.maximum;
                count++;
            }
            Time min = replacePlusMinutes(time, count);
            time.setHour(min.getHour());
            time.setMinutes(min.getMinutes());
            time.setSecond(rez);
        }
        return time;
    }

    public static Time replaceMinusSeconds(Time time, int seconds) {
        int rez = time.getSecond() - seconds;
        if (rez > Time.maximum) {
            time.setMinutes(Time.minimum);
        } else if (rez < Time.minimum) {
            int count = 0;
            int k = rez * (-1);
            while (k >= Time.maximum) {
                k = k - Time.maximum;
                count++;
            }
            time = replaceMinusMinute(time, count);
            time.setSecond(Time.maximum - k);
        } else {
            time.setSecond(rez);
        }
        return time;
    }
}

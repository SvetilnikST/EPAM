package by.svetilnik.epam.d_classes.simpleClasses.task6;

public class TimeLogic {

    public static Time setTimes(Time time, int hour, int minutes, int second) {
        time.setHour(hour);
        time.setMinutes(minutes);
        time.setSecond(second);
        return time;
    }

    //    TODO
    public static Time replacePlusHour(Time time, int hour) {

        if (time.getHour() + hour > Time.maxHour) {
            time.setHour(Time.min);
        } else if (time.getHour() + hour < Time.maxHour) {
            time.setHour(time.getHour() + hour);
        }
        return time;
    }

    //TODO
    public static Time replaceMinusHour(Time time, int hour) {

        if (time.getHour() - hour > Time.maxHour || time.getHour() - hour < Time.min) {
            time.setHour(Time.min);
        } else if (time.getHour() - hour < Time.maxHour && time.getHour() - hour > Time.min) {
            time.setHour(time.getHour() - hour);
        }
        return time;
    }


    public static Time replaceMinusSec(Time time, int second) {

        if (time.getSecond() - second > Time.maxMinuteSec || time.getSecond() - second < Time.min) {
            time.setSecond(Time.min);
        } else if (time.getSecond() - second < Time.maxMinuteSec) {
            time.setSecond(time.getSecond() - second);
        }
        return time;
    }


    public static Time replaceMinusMinute(Time time, int minutes) {

        int rez = time.getMinutes() - minutes; //0-120 = -120

        if (rez > Time.maxMinuteSec) {
            time.setMinutes(Time.min);
        } else if (rez < Time.maxMinuteSec && rez > Time.min) {
            time.setMinutes(rez);
        } else if (rez < Time.min) {
            int count = 1;
            int k = rez * (-1);
            while (k > Time.maxMinuteSec) {
                k = k - Time.maxMinuteSec;
                count++;
            }
            //высчитываем часы
            Time hour = replaceMinusHour(time, count);
            //высчитываем минут
            int minute = Time.maxMinuteSec - k;
            time.setHour(hour.getHour());
            time.setMinutes(minute);
        }
        return time;
    }

    //TODO
    public static Time replacePluseMinute(Time time, int minutes) {

        int rez = time.getMinutes() + minutes; //55+60 = 115,

        if (rez < Time.min) {
            time.setMinutes(Time.min);
        } else if (rez > Time.maxMinuteSec) {
            int count = 0;

            while (rez >= Time.maxMinuteSec) {
                rez = rez - Time.maxMinuteSec;
                count++;
            }
            //высчитываем часы
            Time hour = replacePlusHour(time, count);
            //высчитываем минут
            int minute = rez;
            time.setHour(hour.getHour());
            time.setMinutes(minute);
        }
        return time;
    }


}

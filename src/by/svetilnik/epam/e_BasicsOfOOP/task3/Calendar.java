package by.svetilnik.epam.e_BasicsOfOOP.task3;

import java.util.ArrayList;

public class Calendar {
    private int year;
    private ArrayList<Days> days;

    public Calendar() {
    }

    protected static class Days {
        private int day;
        private Month month;
        private boolean isHoliday;
        private boolean isWeekend;

        public Days(int day, Month month, boolean isHoliday, boolean isWeekend) {
            this.day = day;
            this.month = month;
            this.isHoliday = isHoliday;
            this.isWeekend = isWeekend;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public Month getMonth() {
            return month;
        }

        public void setMonth(Month month) {
            this.month = month;
        }

        public boolean isHoliday() {
            return isHoliday;
        }

        public void setHoliday(boolean holiday) {
            isHoliday = holiday;
        }

        public boolean isWeekend() {
            return isWeekend;
        }

        public void setWeekend(boolean weekend) {
            isWeekend = weekend;
        }
    }

    public Calendar(int year) {
        this.year = year;
        this.days = days;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Days> getDays() {
        return days;
    }

    public void setDays(ArrayList<Days> days) {
        this.days = days;
    }
}

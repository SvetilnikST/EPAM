package by.svetilnik.epam.e_BasicsOfOOP.task3;

import java.util.ArrayList;

import static by.svetilnik.epam.e_BasicsOfOOP.task3.FillMonth.*;

public class Calendar {
    private int year;
    private ArrayList<Days> days;

    public Calendar() {
    }

    protected static class Days {
        private int day;
        private Month month;
        private boolean isHoliday;

        public Days(int day, Month month, boolean isHoliday) {
            this.day = day;
            this.month = month;
            this.isHoliday = isHoliday;
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

    public static void setDays(Calendar calendar) {
        ArrayList<Days> days = new ArrayList<>();

        for (int i = 1; i <13; i++) {
            days.addAll(fill(calendar, i));
        }

        calendar.setDays(days);
        int a = 0;
    }


//    public ArrayList<Days> fillHolidays() {
//        ArrayList<Days> days = new ArrayList<>();
//        days.add(new Days(1, find(1), true));
//        days.add(new Days(2, find(1), true));
//        days.add(new Days(7, find(1), true));
//        days.add(new Days(8, find(3), true));
//
//        return days;
//    }
//
//


}

package by.svetilnik.epam.e_BasicsOfOOP.task3;

import java.util.ArrayList;

import static by.svetilnik.epam.e_BasicsOfOOP.task3.CalendarLogic.findMonth;

public class FillDataCalendar {
    public static ArrayList<Calendar.Days> fillHolidays() {
        ArrayList<Calendar.Days> days = new ArrayList<>();
        days.add(new Calendar.Days(1, findMonth(1), true, true));
        days.add(new Calendar.Days(2, findMonth(1), true, true));
        days.add(new Calendar.Days(7, findMonth(1), true, true));
        days.add(new Calendar.Days(8, findMonth(3), true, true));
        days.add(new Calendar.Days(28, findMonth(4), true, true));
        days.add(new Calendar.Days(1, findMonth(5), true, true));
        days.add(new Calendar.Days(9, findMonth(5), true, true));
        days.add(new Calendar.Days(3, findMonth(7), true, true));
        days.add(new Calendar.Days(7, findMonth(11), true, true));
        days.add(new Calendar.Days(25, findMonth(12), true, true));
        return days;
    }
}

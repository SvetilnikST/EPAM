package by.svetilnik.epam.e_BasicsOfOOP.task3;

import java.util.ArrayList;

public class CalendarLogic {

    public static final int isFeb = 2;
    public static final int isLeapYearFeb = 29;
    public static final int isNotLeapYearFeb = 28;
    public static final int countMonthPlusOne = 13;

    public static void setDays(Calendar calendar) {

        ArrayList<Calendar.Days> days = new ArrayList<>();
        for (int i = 1; i < countMonthPlusOne; i++) {
            days.addAll(fillCalendar(calendar, i));
        }
        calendar.setDays(days);
    }

    public static ArrayList<Calendar.Days> fillCalendar(Calendar calendar, int numberMonth) {

        ArrayList<Calendar.Days> days = new ArrayList<>();

        Month month = findMonth(numberMonth);
        int countDays;

        if (numberMonth == isFeb) {
            if (calendar.getYear() % 400 == 0 ||
                    (calendar.getYear() % 4 == 0 && calendar.getYear() % 100 != 0)
                    )
                countDays = isLeapYearFeb;
            else countDays = isNotLeapYearFeb;
        } else {
            assert month != null;
            countDays = month.getCountDays();
        }

        for (int i = 1; i < countDays + 1; i++) {
            days.add(new Calendar.Days(i, month, false, false));
        }
        return days;
    }

    public static Calendar makeDaysAsHoliday(Calendar calendar, ArrayList<Calendar.Days> holidays) {

        for (Calendar.Days holiday : holidays) {

            int day = holiday.getDay();
            Month month = holiday.getMonth();

            for (int j = 0; j < calendar.getDays().size(); j++) {

                int lastDay = calendar.getDays().get(j).getDay();
                Month lastMonth = calendar.getDays().get(j).getMonth();

                if (day == lastDay && month == lastMonth) {
                    calendar.getDays().get(j).setHoliday(true);
                    calendar.getDays().get(j).setWeekend(true);
                }
            }
        }
        return calendar;
    }


    public static Month findMonth(int numberMonth) {
        switch (numberMonth) {
            case 1:
                return Month.January;
            case 2:
                return Month.February;
            case 3:
                return Month.Marth;
            case 4:
                return Month.April;
            case 5:
                return Month.May;
            case 6:
                return Month.June;
            case 7:
                return Month.July;
            case 8:
                return Month.August;
            case 9:
                return Month.September;
            case 10:
                return Month.October;
            case 11:
                return Month.November;
            case 12:
                return Month.December;
        }
        return null;
    }
}

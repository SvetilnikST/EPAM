package by.svetilnik.epam.e_BasicsOfOOP.task3;

import java.util.ArrayList;

public class FillMonth {

    public static ArrayList<Calendar.Days> fill(Calendar calendar, int numberMonth) {

        ArrayList<Calendar.Days> days = new ArrayList<>();

        if (numberMonth != 0) {
            Month month = find(numberMonth);
            int countDays;
            if (numberMonth == 2) {
                if (calendar.getYear() % 400 == 0 ||
                        (calendar.getYear() % 4 == 0 && calendar.getYear() % 100 != 0)
                        )
                    countDays = 29;
                else countDays = 28;
            } else countDays = month.getCountDays();

            for (int i = 1; i < countDays + 1; i++) {
                days.add(new Calendar.Days(i, month, false));
            }
        }
        return days;
    }


    public static Month find(int numberMonth) {
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

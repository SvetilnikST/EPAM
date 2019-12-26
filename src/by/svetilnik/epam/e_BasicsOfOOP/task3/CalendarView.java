package by.svetilnik.epam.e_BasicsOfOOP.task3;

public class CalendarView {
    public static void printHoliday(Calendar calendar) {
        System.out.println("Выходные в " + calendar.getYear() + " году :");
        for (int i = 0; i < calendar.getDays().size(); i++) {
            if (calendar.getDays().get(i).isHoliday() && calendar.getDays().get(i).isWeekend()) {
                System.out.println(calendar.getDays().get(i).getDay() + " " + calendar.getDays().get(i).getMonth());
            }
        }
    }

}

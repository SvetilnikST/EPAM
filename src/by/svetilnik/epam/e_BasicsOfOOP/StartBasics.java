package by.svetilnik.epam.e_BasicsOfOOP;

import by.svetilnik.epam.e_BasicsOfOOP.task3.Calendar;
import by.svetilnik.epam.e_BasicsOfOOP.task4.Dragon;
import by.svetilnik.epam.e_BasicsOfOOP.task4.Treasure;
import by.svetilnik.epam.e_BasicsOfOOP.task4.TreasureView;

import java.io.IOException;
import java.util.ArrayList;

import static by.svetilnik.epam.e_BasicsOfOOP.task3.CalendarLogic.makeDaysAsHoliday;
import static by.svetilnik.epam.e_BasicsOfOOP.task3.CalendarLogic.setDays;
import static by.svetilnik.epam.e_BasicsOfOOP.task3.CalendarView.printHoliday;
import static by.svetilnik.epam.e_BasicsOfOOP.task3.FillDataCalendar.fillHolidays;

public class StartBasics {
//    public static void task1() {
//        TextFile textFile = new TextFile("first", new Directory("C://SomeDir"), "New File");
//
//        printBody(textFile);
//
//        renameFile(textFile, "second");
//
//        addBodyToFile(textFile, " new String");
//        printBody(textFile);
//
//        deleteBody(textFile);
//        printBody(textFile);
//    }

//    public static void task2() throws IOException {
//        try {
//            Payment payment = new Payment("First");
//            payment.setPayment();
//
//            payment.printTab();
//
//        } catch (NumberFormatException e) {
//            System.out.println("Wrong format");
//        } catch (NullPointerException e) {
//            System.out.println("Array not created");
//        }
//    }

//    public static void task3() {
//        Calendar calendar = new Calendar(2020);
//        setDays(calendar);
//        makeDaysAsHoliday(calendar, fillHolidays());
//        printHoliday(calendar);
//    }

    public static void task4() {

        ArrayList<Treasure> treasures = new ArrayList<>();
        Treasure treasure = new Treasure(new TreasureView("briliant"), 20);

        Dragon dragon = new Dragon("Drqagon1", treasures);
    }
}

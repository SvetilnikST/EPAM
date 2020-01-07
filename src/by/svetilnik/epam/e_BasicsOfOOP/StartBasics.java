package by.svetilnik.epam.e_BasicsOfOOP;

import by.svetilnik.epam.e_BasicsOfOOP.task4.cave.Cave;
import by.svetilnik.epam.e_BasicsOfOOP.task4.Dragon;

import static by.svetilnik.epam.e_BasicsOfOOP.task4.cave.CaveLogic.findMaxCost;
import static by.svetilnik.epam.e_BasicsOfOOP.task4.cave.CaveLogic.setTreasure;
import static by.svetilnik.epam.e_BasicsOfOOP.task4.cave.CaveView.printCave;
import static by.svetilnik.epam.e_BasicsOfOOP.task4.cave.CaveView.printTreasure;

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

        Cave cave = new Cave("one", new Dragon("oneDragon"));
        setTreasure(cave);

//        printCave(cave);

        printTreasure(cave, findMaxCost(cave));
        int a = 0;
    }
}

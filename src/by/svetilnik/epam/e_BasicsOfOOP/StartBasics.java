package by.svetilnik.epam.e_BasicsOfOOP;

import by.svetilnik.epam.e_BasicsOfOOP.task1.Directory;
import by.svetilnik.epam.e_BasicsOfOOP.task1.TextFile;
import by.svetilnik.epam.e_BasicsOfOOP.task2.Payment;
import by.svetilnik.epam.e_BasicsOfOOP.task3.Calendar;

import java.io.IOException;
import java.util.ArrayList;

import static by.svetilnik.epam.e_BasicsOfOOP.task1.FileLogic.*;
import static by.svetilnik.epam.e_BasicsOfOOP.task3.Calendar.setDays;

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

    public static void task3() throws IOException {


        Calendar calendar = new Calendar(2020);
       setDays(calendar);

        int a=0;

    }
}

package by.svetilnik.epam.d_classes.simpleClasses;

import by.svetilnik.epam.d_classes.simpleClasses.task1.Test1;
import by.svetilnik.epam.d_classes.simpleClasses.task2.Test2;
import by.svetilnik.epam.d_classes.simpleClasses.task3.StudentLogic;
import by.svetilnik.epam.d_classes.simpleClasses.task3.Student;
import by.svetilnik.epam.d_classes.simpleClasses.task4.Train;
import by.svetilnik.epam.d_classes.simpleClasses.task5.Counter;
import by.svetilnik.epam.d_classes.simpleClasses.task7.Triangel;

import java.time.LocalTime;
import java.util.*;

import static by.svetilnik.epam.d_classes.simpleClasses.task3.StudentLogic.findExcellentStudents;
import static by.svetilnik.epam.d_classes.simpleClasses.task3.StudentLogic.printAllInfoStudent;
import static by.svetilnik.epam.d_classes.simpleClasses.task3.StudentLogic.printStudents;

public class StartSimpleClasses {



    public static void startSimpleClasses() {

//        task1();
//        task2();
        task3();

//        task4();

//        task5();

//        task7();

    }

    private static void task1() {
        Test1 test1 = new Test1();
        test1.print();
        test1.setParam(1, 2);
        test1.print();
        System.out.println("Sum = " + test1.sum());
        System.out.println("Max = " + test1.max());
    }

    private static void task2() {
        Test2 test2 = new Test2();
        System.out.println(test2.getA() + " ; " + test2.getB());
        test2.setA(200);
        test2.setB(300);
        System.out.println(test2.getA() + ";" + test2.getB());
        Test2 test3 = new Test2(5, 6);
        System.out.println(test3.getA() + " ; " + test3.getB());
    }

    private static void task3() {
        ArrayList<Student> students = StudentLogic.fillListStudent() ;

        printAllInfoStudent(students);

        printStudents(findExcellentStudents(students));

    }

    private static void task4() {


        //Prints 04 hour 45 minutes
//        LocalTime date4 = LocalTime.of(4, 45);
//        System.out.println("Date : " + date4);

        List<Train> trains = new ArrayList<>();
        fillTrain(trains);
        printTrain(trains);

        sortTrainForNumbers(trains);
        System.out.println();
        printTrain(trains);
    }


    public static void task5() {

        Counter counter = new Counter(5);

        for (int i = 0; i < 6; i++) {
            counter.add();
            System.out.println(counter.getCurrent());
        }

        for (int i = 0; i < 10; i++) {
            counter.reduce();
            System.out.println(counter.getCurrent());
        }
    }


    public static void task7() {
        Triangel triangel = new Triangel();

        System.out.println("Area:" +  triangel.area());

    }



    private static void fillTrain(List<Train> trains) {
        trains.add(new Train("five", 5, LocalTime.of(5, 0)));
        trains.add(new Train("one", 1, LocalTime.of(4, 50)));
        trains.add(new Train("tree", 3, LocalTime.of(10, 35)));
        trains.add(new Train("two", 2, LocalTime.of(7, 30)));
        trains.add(new Train("four", 4, LocalTime.of(1, 30)));


    }

    private static void printTrain(List<Train> trains) {
        for (Train train : trains) {
            System.out.println(
                    train.getNameDestination() + ":" +
                            train.getNumberTrain() + " - " +
                            train.getDepartureTime().toString()
            );
        }
    }


    //some me
    private static void sortTrainForNumbers(List<Train> trains) {


    }
}

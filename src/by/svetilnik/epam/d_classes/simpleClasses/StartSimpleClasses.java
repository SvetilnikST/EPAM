package by.svetilnik.epam.d_classes.simpleClasses;

import by.svetilnik.epam.d_classes.simpleClasses.task1.Test1;
import by.svetilnik.epam.d_classes.simpleClasses.task2.Test2;
import by.svetilnik.epam.d_classes.simpleClasses.task3.Student;
import by.svetilnik.epam.d_classes.simpleClasses.task3.StudentLogic;
import by.svetilnik.epam.d_classes.simpleClasses.task4.Train;
import by.svetilnik.epam.d_classes.simpleClasses.task5.Counter;
import by.svetilnik.epam.d_classes.simpleClasses.task6.Time;
import by.svetilnik.epam.d_classes.simpleClasses.task7.Triangel;

import java.util.ArrayList;

import static by.svetilnik.epam.d_classes.simpleClasses.task2.Test2View.printTest2;
import static by.svetilnik.epam.d_classes.simpleClasses.task3.StudentLogic.findExcellentStudents;
import static by.svetilnik.epam.d_classes.simpleClasses.task3.StudentView.printAllInfoStudent;
import static by.svetilnik.epam.d_classes.simpleClasses.task3.StudentView.printStudents;
import static by.svetilnik.epam.d_classes.simpleClasses.task4.TrainLogic.fillTrains;
import static by.svetilnik.epam.d_classes.simpleClasses.task4.TrainLogic.sortTrainForNumbers;
import static by.svetilnik.epam.d_classes.simpleClasses.task4.TrainView.printTrain;
import static by.svetilnik.epam.d_classes.simpleClasses.task6.Time.printTime;
import static by.svetilnik.epam.d_classes.simpleClasses.task7.TriangelLogic.*;

public class StartSimpleClasses {


    public static void startSimpleClasses() {

//        task1();
//        task2();
//        task3();

//        task4();

        task6();

//        task5();

//        task7();

    }


    private static void task1() {
        Test1 test1 = new Test1();
        test1.setParam(1, 2);
        test1.print();
        System.out.println("Sum = " + test1.sum() + " " + "Max" + test1.max());
    }

    private static void task2() {
        Test2 test2 = new Test2();
        printTest2(test2);

        test2.setA(200);
        test2.setB(300);
        printTest2(test2);

        Test2 test3 = new Test2(5, 6);
        printTest2(test3);
    }

    private static void task3() {
        ArrayList<Student> students = StudentLogic.fillListStudent();
        printAllInfoStudent(students);
        printStudents(findExcellentStudents(students));
    }

    private static void task4() {

        ArrayList<Train> trains = new ArrayList<>();
        fillTrains(trains);
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

    private static void task6() {
        Time time = new Time();
        time.setHour(145);
        time.setMinutes(10);
        time.setSecond(122);
        printTime(time);
    }


    public static void task7() {

        Triangel triangel = new Triangel();
        System.out.println("Area:" + area(triangel));
        System.out.println("Area:" + areaAcrossSide(triangel));
        System.out.println("Area Geron:" + areaGeron(triangel));
        System.out.println("Area Equilateral:" + areaEquilateral(triangel));
        median(triangel);
    }
}

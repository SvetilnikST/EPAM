package com.svetilnik.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class StartTest {

    private static final int POINT_NINE = 9;
    private static final int POINT_TEN = 10;

    public static void startTest()  {

//        task1();
//        task2();
//        task3();
        try {
            task4();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void task1() {
        Test1 test1 = new Test1();
        test1.print();
        test1.setParam(1, 2);
        test1.print();
        System.out.println("Sum = " + test1.sum());
        System.out.println("Max = " + test1.ret());
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
        int count = 0;

        ArrayList<Student> students = new ArrayList<>();

        fillListStudent(students);

        for (int i = 0; i < students.size(); i++) {

            for (int j = 0; j < students.get(i).progress1.length; j++) {

                if (students.get(i).progress1[j] == POINT_NINE || students.get(i).progress1[j] == POINT_TEN) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(students.get(i).fullName + "  " + students.get(i).groupNumber);
            }
            count = 0;
        }
    }

    private static void task4() throws ParseException {

        String pattern = "HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = simpleDateFormat.parse("22:00:03");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ArrayList<Train> trains = new ArrayList<>();
        fillTrain(trains);

        for (int i = 0; i < trains.size(); i++) {
            System.out.println(
                    trains.get(i).getNameDestination() +
                            trains.get(i).getNumberTrain()+
                            trains.get(i).getDepartureTime().toString()
                    );
        }

    }

    private static void fillListStudent(ArrayList<Student> students) {

        students.add(new Student("1 Ivanov", "P-1", new int[]{5, 6, 7, 10, 9}));
        students.add(new Student("2 Petrov", "P-2", new int[]{5, 6, 7, 8, 4}));
        students.add(new Student("3 Novikov", "P-3", new int[]{5, 6, 7, 8, 9}));
        students.add(new Student("4 Sidorov", "P-3", new int[]{5, 6, 7, 8, 9}));
        students.add(new Student("5 Sidorov", "P-3", new int[]{5, 6, 7, 8, 1}));
        students.add(new Student("6 Novikov", "P-3", new int[]{5, 6, 7, 8, 2}));
        students.add(new Student("7 Sidorov", "P-3", new int[]{5, 6, 7, 8, 9}));
        students.add(new Student("8 Sidorov", "P-3", new int[]{5, 6, 7, 8, 2}));
        students.add(new Student("9 Lionov", "P-3", new int[]{5, 6, 7, 10, 4}));
        students.add(new Student("10 Sidorov", "P-3", new int[]{5, 6, 7, 8, 1}));
    }

    private static void fillTrain(ArrayList<Train> trains) throws ParseException {
        String pattern = "HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        trains.add(new Train("one", 1, simpleDateFormat.parse("00:00:03")));
        trains.add(new Train("two", 2, simpleDateFormat.parse("19:00:03")));
        trains.add(new Train("tree", 3, simpleDateFormat.parse("22:00:03")));
        trains.add(new Train("four", 4, simpleDateFormat.parse("21:00:03")));
        trains.add(new Train("five", 5, simpleDateFormat.parse("23:00:03")));

    }
}

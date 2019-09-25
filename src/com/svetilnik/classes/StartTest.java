package com.svetilnik.classes;

import java.util.ArrayList;

public class StartTest {

    public static void startTest() {

//        task1();
//        task2();
//        studentTask3();
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

    private static void studentTask3() {
        int count = 0;

        ArrayList<Student> students = new ArrayList<>();
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

        for (int i = 0; i < students.size(); i++) {

            for (int j = 0; j < students.get(i).progress1.length; j++) {

                if (students.get(i).progress1[j] == 9 || students.get(i).progress1[j] == 10) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(students.get(i).fullName + "  " + students.get(i).groupNumber);
            }
            count = 0;
        }
    }
}

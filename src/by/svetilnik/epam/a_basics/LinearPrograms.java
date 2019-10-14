package by.svetilnik.epam.a_basics;

import static java.lang.Math.*;

public class LinearPrograms {

    public static double task1(double a, double b, double c) {

        return (a - 3) * b / 2 + c;
    }

    public static void task2(double a, double b, double c) {

        double Z;
        double numerator;
        double denominator;
        double fraction;

        numerator = b + sqrt(pow(b, 2) + 4 * a * c);
        denominator = 2 * a;

        fraction = numerator / denominator;
        Z = fraction - pow(a, 3) * c + pow(b, -2);

        System.out.printf("Task_2: %.3f", Z);
        System.out.println();
    }

    public static void task3(double x, double y) {

        double Z;
        double numerator;
        double denominator;
        double fraction;

        numerator = sin(x) + cos(y);
        denominator = cos(x) - sin(y);
        fraction = numerator / denominator;

        Z = fraction * tan(x * y);

        System.out.printf("Task_3: %.3f", Z);
        System.out.println();
    }

    public static double task4(double x) {

        int left;
        double right;

        left = (int) x;
        right = Math.round((x - left) * 1000);

        return right + left / 1000.0;
    }

    public static void task5(int time) {

        int hour;
        int minute;
        int second;

        hour = time / 3600;
        minute = time % 3600 / 60;
        second = time % 60;

        System.out.printf("Task_5: %02dч %02dмин %02dс.", hour, minute, second);
        System.out.println();
    }

    public static boolean linearTask6(double x, double y) {

        return (x >= -4) && (x <= 4) && (y >= -3) && (y <= 4);
    }
}

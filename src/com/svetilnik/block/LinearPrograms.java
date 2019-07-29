package com.svetilnik.block;

import static java.lang.Math.*;

/**
 * Класс, где реализованы решения задач блока "Линейные программы"
 */

public class LinearPrograms {

    /**
     * Найти значение функции  z = ((a - 3) * b / 2) + c;
     */
    public static void linearTask1(double a, double b, double c) {

        double z;
        z = ((a - 3) * b / 2) + c;
        System.out.println("Linear task_1 Result Z = " + z);
    }

    /**
     * Вычислить выражение по формуле
     * (все переменные принимают действительные числа).
     */
    public static void linearTask2(double a, double b, double c) {

        double Z, numerator, denominator, fraction;

        numerator = b + sqrt(pow(b, 2) + 4 * a * c);

        denominator = 2 * a;

        fraction = numerator / denominator;

        Z = fraction - pow(a, 3) * c + pow(b, -2);

        System.out.printf("Linear task_2 Result Z = %.3f", Z);
        System.out.println();
    }

    /**
     * Вычислить выражение по формуле
     * (все переменные принимают действительные числа).
     */
    public static void linearTask3(double x, double y) {

        double Z, numerator, denominator, fraction;

        numerator = sin(x) + cos(y);
        denominator = cos(x) - sin(y);
        fraction = numerator / denominator;

        Z = fraction * tan(x * y);

        System.out.println("Linear task_3 Result Z = " + Z);
    }

    public static void linearTask4(double x) {

        int left;
        double right, result;

        left = (int) x;
        right = Math.round((x - left) * 1000);
        result = right + left / 1000.0;

        System.out.println("Linear task_4 Result = " + result);
    }

    /**
     * Дано натуральное число длительность прошедшего времени в секундах. привести к формату HH:mm:ss
     */
    public static void linearTask5(int time) {

        int hour, minute, second;

        hour = time / 3600;
        minute = time % 3600 / 60;
        second = time % 60;

        System.out.println("Linear task_5 Result = " + hour + "ч " + minute + "мин " + second + "с.");
    }

    /**
     * Попадание/нет в заданную область
     */
    public static boolean linearTask6(int x, int y) {

        return (x >= -4) && (x <= 4) && (y >= -3) && (y <= 4);

    }



}

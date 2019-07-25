package com.svetilnik.block;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Класс, где реализованы решения задач блока "Линейные программы"
 */

public class LinearPrograms {

    /**
     * Найти значение функции  z = ((a - 3) * b / 2) + c;
     */
    public static void lineTask1() {

        int a, b, c, z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 4 целых числа:");

        System.out.println("a: ");
        a = scanner.nextInt();

        System.out.println("b: ");
        b = scanner.nextInt();

        System.out.println("c: ");
        c = scanner.nextInt();

        z = ((a - 3) * b / 2) + c;

        System.out.println("Результат вычислений:" + z);

        scanner.close();
    }

    /**
     * Вычислить выражение по формуле
     * (все переменные принимают действительные числа).
     */
    public static void lineTask2() {

        double a, b, c, Z;
//        a = 1.0;
//        b = 1.0;
//        c = 1.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 действительных числа:");

        System.out.println("a: ");
        a = scanner.nextDouble();

        System.out.println("b: ");
        b = scanner.nextDouble();

        System.out.println("c: ");
        c = scanner.nextDouble();

        Z = ((b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a) - (pow(a, 3) * c + pow(b, -2));

        System.out.printf("Результат вычислений: %.3f", Z);

        scanner.close();

    }

    /**
     * Вычислить выражение по формуле
     * (все переменные принимают действительные числа).
     */
    public static void lineTask3() {

        double x, y, Z;
//        x = 1;
//        y = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 2 действительных числа:");

        System.out.println("x: ");
        x = scanner.nextDouble();

        System.out.println("y: ");
        y = scanner.nextDouble();

        Z = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);

        System.out.println("Результат вычислений: " + Z);

        scanner.close();
    }


    //TODO переделать
    //нужно ещё подумать. при числе 354.789 проблема с округрлением при расчетах
    public static void lineTask4() {

        double x = 354.789;

        int left = (int) x;
        int right = (int) ((x - left) * 1000);
        double d = right + (double) left / 1000;
        System.out.println("Начальное число: " + x);
        System.out.println("Число после преобразования: " + d);
    }


    /**
     * Дано натуральное число длительность прошедшего времени в секундах. привести к формату HH:mm:ss
     */
    public static void lineTask5() {

        int time = 8000;
        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int second = time % 60;

        System.out.print(hour + "ч ");
        System.out.print(minute + "мин ");
        System.out.print(second + "с.");
    }

    /**
     * Попадание/нет в заданную область
     */
    public static void lineTask6() {

        int x, y;
//        x = -5;
//        y = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 2 действительных числа:");
        System.out.println("x: ");
        x = scanner.nextInt();

        System.out.println("y: ");
        y = scanner.nextInt();

        if (((x >= -3) && (x <= 4) && (y >= -3) && (y <= 4))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();

    }
}

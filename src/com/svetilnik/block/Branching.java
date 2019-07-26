package com.svetilnik.block;

import java.util.Scanner;

/**
 * Класс содержащий решение задач блока "Ветвления"
 */
public class Branching {

    /**
     * Даны два угла. определить существует ли треугольник
     */
    public static void branchingTask1() {

        int a, b;

//        a = 90;
//        b = 30;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 2 целых числа:");

        System.out.println("a: ");
        a = scanner.nextInt();

        System.out.println("b: ");
        b = scanner.nextInt();

        if ((a + b) < 180) {
            System.out.println("Треугольник существует!");

            if ((a == 90) || (b == 90) || (a + b == 90)) {
                System.out.println("Третий угол прямоугольный.");
            } else
                System.out.println("Третий угол не прямоугольный.");
        } else
            System.out.println("Треугольник не существует!");

        scanner.close();
    }

    /**
     * Найти max{min(a,b), min(c,d)}
     */
    public static void branchingTask2() {

        int a, b, c, d, minLeft, minRight, max;

//        a = 1;
//        b = 2;
//        c = 3;
//        d = 4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 4 целых числа:");

        System.out.print("a: ");
        a = scanner.nextInt();

        System.out.print("b: ");
        b = scanner.nextInt();

        System.out.print("c: ");
        c = scanner.nextInt();

        System.out.print("d: ");
        d = scanner.nextInt();

        minLeft = a < b ? a : b;

        minRight = c < d ? c : d;

        max = minLeft > minRight ? minLeft : minRight;

        System.out.println("Max= " + max);

        scanner.close();
    }

    /**
     * Определить расположены ли три точки на одной прямой
     */
    public static void branchingTask3() {
//        int x1 = 3, x2 = -5, x3 = 27;
//        int y1 = -7, y2 = 4, y3 = -40;
        int x1, x2, x3, y1, y2, y3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты (целые числа) трех точек:");

        System.out.println("А (x1,y1): ");
        System.out.print(" x1: ");
        x1 = scanner.nextInt();
        System.out.print(" y1: ");
        y1 = scanner.nextInt();

        System.out.println("B (x2,y2): ");
        System.out.print(" x2: ");
        x2 = scanner.nextInt();
        System.out.print(" y2: ");
        y2 = scanner.nextInt();

        System.out.println("C (x3,y3): ");
        System.out.print(" x3: ");
        x3 = scanner.nextInt();
        System.out.print(" y3: ");
        y3 = scanner.nextInt();

        if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1))) {
            System.out.println("Точки на одной прямой.");
        } else {
            System.out.println("Точки не на одной прямой.");
        }

        scanner.close();

    }

    /**
     * Заданы размеры a b прямоугольного отверстия и размеры x y z кирпича
     */
    public static void branchingTask4() {
        Scanner scanner = new Scanner(System.in);

        int A, B, x, y, z;

        System.out.println("Введите значения прямоугольного отверстия (целые числа):");

        System.out.print("A: ");
        A = scanner.nextInt();

        System.out.print("B: ");
        B = scanner.nextInt();

        System.out.println("Введите размеры кирпича (целые числа):");

        System.out.print("x: ");
        x = scanner.nextInt();

        System.out.print("y: ");
        y = scanner.nextInt();

        System.out.print("z: ");
        z = scanner.nextInt();

        if ((((A < x) && (B < y)) || ((A < x) && (B < z)) || ((A < z) && (B < y)))) {
            System.out.println("Кирпич не пройдет через отверстие.");
        } else {
            System.out.println("Кирпич через отверстие пройдет.");
        }

        scanner.close();

    }


}

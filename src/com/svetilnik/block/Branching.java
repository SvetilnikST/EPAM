package com.svetilnik.block;

public class Branching {

    //TODO Done
    public static void branchingTask1() {
        int a, b;
        a = 90;
        b = 30;
        if ((a + b) < 180) {
            System.out.println("Треугольник существует!");
            if ((a == 90) || (b == 90) || (a + b == 90)) {
                System.out.println("Третий угол прямоугольный.");
            } else System.out.println("Третий угол не прямоугольный.");
        } else System.out.println("Треугольник не существует!");
    }

    //TODO Done
    public static void branchingTask2() {
        int a = 1, b = 2, c = 3, d = 4;

        int min1 = a < b ? a : b;
        int min2 = c < d ? c : d;
        int max = min1 > min2 ? min1 : min2;
        System.out.println("Max= "+max);
    }


    public static void branchingTask3() {
        int x1 = 3, x2 = -5, x3 = 27;
        int y1 = -7, y2 = 4, y3 = -40;

        if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1))) {
            System.out.println("Точки на одной прямой.");
        } else System.out.println("Точки не на одной прямой.");


    }


}

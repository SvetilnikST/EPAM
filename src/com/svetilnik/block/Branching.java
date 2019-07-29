package com.svetilnik.block;

/**
 * Класс содержащий решение задач блока "Ветвления"
 */
public class Branching {

    private static final int right_angle = 90;
    private static final int half_circle = 180;

    /**
     * Даны два угла. определить существует ли треугольник
     */
    public static void branchingTask1(int a, int b) {

        System.out.print("Branching task_1 Result: ");

        if (a + b < half_circle) {

            System.out.print("The triangle exists!");

            if ((a == right_angle) || (b == right_angle) || (a + b == right_angle)) {
                System.out.println("The third corner is rectangular. ");
            } else
                System.out.println("The third corner is not rectangular. ");
        } else
            System.out.println("Triangle does not exist!");
    }

    /**
     * Найти max{min(a,b), min(c,d)}
     */
    public static void branchingTask2(int a, int b, int c, int d) {

        int minLeft, minRight, max;

        minLeft = a < b ? a : b;
        minRight = c < d ? c : d;
        max = minLeft > minRight ? minLeft : minRight;

        System.out.println("Branching task_2 Result: Max = " + max);
    }

    /**
     * Определить расположены ли три точки на одной прямой
     */
    public static void branchingTask3(int x1, int x2, int x3, int y1, int y2, int y3) {

        int left, right;

        left = (x3 - x1) / (x2 - x1);
        right = (y3 - y1) / (y2 - y1);

        if (left == right) {
            System.out.println("Branching task_3 Result: Points on one straight line.");
        } else {
            System.out.println("Branching task_3 Result: The points are not on one straight line.");
        }
    }

    /**
     * Заданы размеры a b прямоугольного отверстия и размеры x y z кирпича
     */
    public static void branchingTask4(int A, int B, int x, int y, int z) {

        String answerFalse = "Branching task_4 Result: Brick will pass.";
        String answerTrue = "Branching task_4 Result: Brick will not pass";

        if ((A < x) && (B < y)) {
            System.out.println(answerFalse);
        } else if ((A < x) && (B < z)) {
            System.out.println(answerFalse);
        } else if ((A < z) && (B < y)) {
            System.out.println(answerFalse);
        } else
            System.out.println(answerTrue);
    }


    public static double branchingTask5(double x) {
        if (x <= 3.0)
            return Math.pow(x, 3) - 3 * x + 9;
        else
            return 1 / (Math.pow(x, 3) + 6);
    }

}

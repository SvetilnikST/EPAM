package by.svetilnik.epam.a_basics;

public class Branching {

    private static final int right_angle = 90;
    private static final int half_circle = 180;

    public static void task1(int a, int b) {

        System.out.print("Task_1: ");

        if (a + b < half_circle) {

            System.out.print("The triangle exists!");

            if ((a == right_angle) || (b == right_angle) || (a + b == right_angle)) {
                System.out.println("The third corner is rectangular. ");
            } else
                System.out.println("The third corner is not rectangular. ");
        } else
            System.out.println("Triangle does not exist!");
    }

    public static int task2(int a, int b, int c, int d) {

        int minLeft;
        int minRight;

        minLeft = a < b ? a : b;
        minRight = c < d ? c : d;

        return minLeft > minRight ? minLeft : minRight;
    }

    public static boolean task3(int x1, int x2, int x3, int y1, int y2, int y3) {

        int left;
        int right;

        left = (x3 - x1) / (x2 - x1);
        right = (y3 - y1) / (y2 - y1);

        return left == right;
    }

    public static boolean task4(int A, int B, int x, int y, int z) {

        if ((A < x) && (B < y)) {
            return false;
        } else if ((A < x) && (B < z)) {
            return false;
        } else return (A >= z) || (B >= y);
    }

    public static double task5(double x) {
        if (x <= 3.0)
            return Math.pow(x, 3) - 3 * x + 9;
        else
            return 1 / (Math.pow(x, 3) + 6);
    }
}

package com.svetilnik;

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


}

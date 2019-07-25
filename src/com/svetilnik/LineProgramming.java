package com.svetilnik;

import java.util.Scanner;

import static java.lang.Math.*;


public class LineProgramming {

    public static Scanner in = new Scanner(System.in);

    public static void lineTask1() {
        int a, b, c, z;

        System.out.println("Enter a: ");
        a = in.nextInt();

        System.out.println("Enter b: ");
        b = in.nextInt();

        System.out.println("Enter c: ");
        c = in.nextInt();

        z = ((a - 3) * b / 2) + c;

        System.out.println("Rezult:" + z);
        in.close();
    }

    //пересмотреть решение
    public static void lineTask2() {
        double a, b, c, Z;

//        System.out.println("Enter a: ");
//        a = in.nextInt();
//
//        System.out.println("Enter b: ");
//        b = in.nextInt();
//
//        System.out.println("Enter c: ");
//        c = in.nextInt();

        a = 1.0;
        b = 1.0;
        c = 1.0;

        Z = ((b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a) - (pow(a, 3) * c + pow(b, -2));

        System.out.println("Result 2: " + Z);
    }

    public static void lineTask3() {
        double x, y, Z;

        x = 1;
        y = 1;

        Z = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);

        System.out.println("Result 3: " + Z);
    }

    //нужно ещё подумать. при числе 354.789 проблема с округрлением при расчетах
    public static void lineTask4() {
        double x = 354.789;

        int left = (int) x;
        int right = (int) ((x - left) * 1000);
        double d = right + (double) left / 1000;
        System.out.println("Start number: " + x);
        System.out.println("End number: " + d);

    }


    //TODO Done
    //дано натуральное число длительность прошедшего времени в секундах. привести к формату HH:mm:ss
    public static void lineTask5() {
        int time = 8000;
        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int second = time % 60;

        System.out.print(hour + "ч ");
        System.out.print(minute + "мин ");
        System.out.print(second + "с.");
    }

    //TODO DONE
    public static void lineTask6(){
        int x,y;
        x=-5;
        y=3;

        if (((x >= -3) && (x <= 4) && (y >= -3) && (y <= 4))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}

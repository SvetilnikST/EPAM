package com.svetilnik;

import java.util.Scanner;

import static java.lang.Math.*;


public class LineProgramming {

    public static Scanner in = new Scanner(System.in);

    public static void task1() {
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
    public static void task2() {
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

}

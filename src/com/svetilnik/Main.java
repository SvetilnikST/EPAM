package com.svetilnik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int a, b, c, z;

        Scanner in = new Scanner(System.in);

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
}

package com.svetilnik.block;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Cycles {

    //TODO Done
    public static void cyclesTask1() {
        Scanner in = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Введите любое целое положительное число: ");
        number = in.nextInt();

        while (number < 0) {
            System.out.println("Вы ввели неверное число, попробуйте ещё раз!");
            number = in.nextInt();
        }

        for (int i = 1; i < number; i++) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("Сумма = " + sum);
        in.close();
    }

    //TODO Done
    public static void cyclesTask3() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum = sum + (int) pow(i, 2);
        }
        System.out.println("Сумма = " + sum);
    }

    //TODO Done
    public static void cyclesTask4() {
        int pr=1;
        for (int i = 1; i < 5; i++) {
            pr = pr*(int) pow(i, 2);
        }
        System.out.println("Произведение = " + pr);
    }


}

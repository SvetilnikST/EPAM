package com.svetilnik.a_basics;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

/**
 * Класс с решением задач из блока "Циклы"
 */
public class Cycles {

    private static final int mod = 10;
    private static final int ASCIIcharacters = 128;

    /**
     * Суммирование всех чисел от 1 до введенного пользователем
     */
    public static void cyclesTask1() {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.print("Enter a positive integer: ");
        number = scanner.nextInt();

        while (number < 0) {
            System.out.println("You entered an invalid number. Try again!");
            number = scanner.nextInt();
        }

        System.out.print("Cycles task_1 Result: ");
        for (int i = 1; i < number; i++) {
            sum = sum + i;
            System.out.print(i + " ");
        }

        System.out.println("Sum = " + sum);
        scanner.close();
    }

    public static void cyclesTask2(int a, int b, int h) {
        System.out.print("Cycles task_2 Result: ");
        while (a <= b) {
            System.out.print(funcY(a) + " ");
            a = a + h;
        }
        System.out.println();
    }

    private static int funcY(int x) {
        if (x > 2) return x;
        else return -x;
    }


    /**
     * Найти сумму квадратов первых ста чисел
     */
    public static void cyclesTask3() {

        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum = sum + (int) pow(i, 2);
        }

        System.out.println("Cycles task_3 Result: Sum = " + sum);
    }

    /**
     * Нахождение произведения квадратов первых двухсот чисел
     */
    public static void cyclesTask4() {

        int productOfNumbers = 1;

        for (int i = 1; i < 5; i++) {
            productOfNumbers = productOfNumbers * (int) pow(i, 2);
        }

        System.out.println("Cycles task_4 Result: Product of numbers = " + productOfNumbers);
    }

    /**
     * Дан числовой ряд и число е. найти сумму тех членов ряда, можуль которых больше или равен заданному е.
     */
    public static void cyclesTask5(double e, int n) {

        double a;
        double sum = 0.0;

        for (int i = 1; i < n; i++) {
            a = 1 / pow(2, i) + 1 / pow(3, i);
            System.out.println("Member row №" + i + " :" + a);
            if ((abs(a) > e) || (abs(a) == e)) {
                sum = sum + a;
            }
        }
        System.out.println("Cycles task_5 Result: Sum = " + sum);
    }

    /**
     * Вывести на экран соответствия между символами и их численными значениями
     */
    public static void cyclesTask6() {
        System.out.println("Cycles task_6 Result:");
        for (char c = 0; c < ASCIIcharacters; c++) {
            if (Character.isLowerCase(c))
                System.out.println("Symbol: " + c + " value: " + (int) c);
        }
    }

    /**
     * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
     */
    public static void cyclesTask7(int m, int n) {

        System.out.println("Cycles task_7 Result:");
        while (m <= n) {
            if (m > 0) {
                System.out.print(m + ": ");
                dividerSearch(m);
                System.out.println();
            }
            m++;
        }
    }

    private static void dividerSearch(int m) {
        int i = 2;
        while (i <= m / 2) {
            if (m % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    //Даны два числа. Определить цифры входящие в запись как первого, так и второго числа
    public static void cyclesTask8(int a, int b) {

        int c;
        int d;

        ArrayList<Integer> list = new ArrayList<>();

        while (a > 0) {
            d = Math.floorMod(a, mod);
            a = a / mod;
            c = b;
            while (c > 0) {
                if (Math.floorMod(c, mod) == d) {
                    if (list.contains(d)) {
                        break;
                    } else
                        list.add(d);
                    break;
                }
                c = c / mod;
            }
        }
        System.out.println(list.toString());
    }


}



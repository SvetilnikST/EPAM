package com.svetilnik.block;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

/**
 * Класс с решением задач из блока "Циклы"
 */
public class Cycles {

    /**
     * Суммирование всех чисел от 1 до введенного пользователем
     */
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

    /**
     * Найти сумму квадратов первых ста чисел
     */
    public static void cyclesTask3() {

        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum = sum + (int) pow(i, 2);
        }

        System.out.println("Сумма = " + sum);
    }

    /**
     * Нахождение произведения квадратов первых двухсот чисел
     */
    public static void cyclesTask4() {

        int pr = 1;

        for (int i = 1; i < 5; i++) {
            pr = pr * (int) pow(i, 2);
        }

        System.out.println("Произведение = " + pr);
    }

    /**
     * Дан числовой ряд и число е. найти сумму тех членов ряда, можуль которых больше или равен заданному е.
     */
    public static void cycleTask5() {
//        double e = -3.0;
//        double sum = 0.0;
//        int n = 4;
//        double a;
        double e, a;
        int n;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа:");

        System.out.print("e (действительное): ");
        e = scanner.nextDouble();

        System.out.print("n (целое число): ");
        n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            a = 1 / pow(2, i) + 1 / pow(3, i);
            System.out.println("Член ряда №" + i + " :" + a);
            if ((abs(a) > e) || (abs(a) == e)) {
                sum = sum + a;
            }
        }
        System.out.println("Сумма членов ряда, модуль которых '>=' e: " + sum);
    }

    /**
     * Вывести на экран соответствия между символами и их численными значениями
     */
    public static void cyclesTask6() {
        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c))
                System.out.println("Cимвол: " + c + " значение: " + (int) c);
        }
    }

    /**
     * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
     */
    public static void cyclesTask7() {

        int m, n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 целых числа:");

        System.out.print("m: ");
        m = scanner.nextInt();

        System.out.print("n: ");
        n = scanner.nextInt();

        while (m <= n) {
            if (m > 0) {
                System.out.print(m + ": ");
                find(m);
                System.out.println();
            }
            m++;
        }
    }

    static void find(int m) {
        int i = 2;
        while (i <= m/2) {
            if (m % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

}



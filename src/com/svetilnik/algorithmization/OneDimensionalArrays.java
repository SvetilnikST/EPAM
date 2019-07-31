package com.svetilnik.algorithmization;

import java.util.Random;
import java.util.stream.IntStream;

public class OneDimensionalArrays {
    public static void OneArraysTask1(int N, int K) {

        int sum = 0;
        int[] A = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
            System.out.print(A[i] + " ");
        }

        System.out.println();

        for (int array : A) {
            if (array % K == 0) {
                sum = sum + array;
            }
        }
        System.out.println("Rezalt OneArrays Task1: Sum =" + sum);
    }

    public static void OneArraysTask2(int n, double Z) {

        int count = 0;
        double[] array = new double[n];

        fillDoubleArray(array);
        print(array);

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > Z) {
                array[i] = Z;
                count++;
            }
        }
        print(array);
        System.out.println("Number of replacements = " + count);
    }

    public static void OneArraysTask3(int n, double Z) {

        int positive = 0;
        int negative = 0;
        int nullElemet = 0;

        double[] array = new double[n];

        fillDoubleArray(array);

        for (double ellement : array) {
            if (ellement < 0) {
                negative++;
            } else if (ellement == 0) {
                nullElemet++;
            } else if (ellement > 0)
                positive++;
        }

        print(array);
        System.out.println(" Positive = " + positive + " Negative = " + negative + " NullElement = " + nullElemet);
    }

    public static void OneArraysTask4(int n, double Z) {
        double[] array = new double[n];

        double min;
        double max;

        fillDoubleArray(array);
        print(array);
        System.out.println();
        min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        System.out.print("Min = " + min + " ");

        max = array[0];
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println("Max = " + max);

        array[indexMax] = min;
        array[indexMin] = max;

        print(array);

    }


    public static void OneArraysTask5(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }

    }

    //не работает
    public static void OneArraysTask6(int n) {

        double[] array = new double[n];
        double sum = 0.0;
        fillDoubleArray(array);

        for (int i = 0; i < array.length; i++) {


        }
        print(array);
        System.out.println("Sum = " + sum);

    }


    private static void print(double[] array) {
        for (double arr : array) {
            System.out.print(arr + "  ");
        }
    }

    private static void fillDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1.0;
        }
    }
}

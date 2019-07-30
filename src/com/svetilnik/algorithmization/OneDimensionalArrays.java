package com.svetilnik.algorithmization;

import java.util.Random;

public class OneDimensionalArrays {
    public static void OneArraysTask1(int N, int K) {

        int[] A = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = i + 1;
            System.out.print(A[i]);
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

        double[] array = new double[n];
        int count = 0;

        fillArray(array);
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

    private static void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void fillArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1.0;
        }
    }


    public static void OneArraysTask3(int n, double Z) {
        int positive = 0;
        int negative = 0;
        int nullElemet = 0;

        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 0.5;
        }

        for (double anArray : array) {
            if (anArray < 0) {
                negative++;
            } else if (anArray == 0) {
                nullElemet++;
            } else if (anArray > 0)
                positive++;
        }

        print(array);

        System.out.println(" Positive = " + positive + " Negative = " + negative + " NullElement = " + nullElemet);
    }

    public static void OneArraysTask4(int n, double Z) {


    }


}

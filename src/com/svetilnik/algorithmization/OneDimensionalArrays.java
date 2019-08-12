package com.svetilnik.algorithmization;

import static java.lang.Long.sum;

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


    public static void OneArraysTask6(int n) {
        double[] array = new double[n];
        double sum = 0.0;
        fillDoubleArray(array);
        for (int i = 2; i < n; i++) {
            boolean k = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k = false;
                    break;
                }
            }
            if (k) {
                sum = sum + array[i];
            }
        }
        print(array);
        System.out.println("Sum = " + sum);

    }

    //TODO исправить
//    public static void OneArraysTask7(int n) {
//
//        int[][] arr = new int[n][n];
//        int tmp;
//        int max;
//
//        max = sum(0,arr,n);
//        for (int i = 1; i < n - 1; i++) {
//            if (max < tmp) {
//                max = tmp;
//            }
//
//            tmp = RetMax(sum(i, n), sum((i + 1), n));
//        }
//
//
//    }
//
//    private static int sum(int i, int[][] arr, int n) {
//
//        int l = 2 * n - 1 - i;
//        int sum = arr[i] + arr[l];
//
//        return sum;
//    }

//    private static void sum(int n) {
//        int sum=0;
//        for (int i = 0; i < n; i++) {
//            sum = arr[i] + arr[2 * n - 1 - i];
//        }
//
//    }



//    private int RetMax(int a, int b) {
//        if (a > b) return a;
//        else return b;
//    }

    public static void OneArraysTask8(int n) {

        int a[] = new int[n];

        printInt(a);
        int min = a[0];
        int count = 0;
        int index = 0;

        for (int anA : a) {
            if (anA < min) min = anA;

        }

        for (int anA : a) {
            if (anA == min) {
                count++;
            }
        }

        int b[] = new int[a.length - count];
        for (int anA : a) {
            if (anA != min) {
                b[index] = anA;
                index++;
            }
        }
        System.out.println();
        printInt(b);
    }


    //TODO разобраться до конца
//    public static void OneArraysTask9() {
//        int[] a = new int[]{3, 3, 1,1};
//
//        int num = a[0];
//        int max = 1;
//        int min = a[0];
//
//        for (int i = 0; i < a.length; i++) {
//
//            int count = 1;
//
//            for (int j = i+1; j < a.length; j++) {
//
//                if (a[i] == a[j]) {
//                    count++;
//
//                    if (count > max) {
//                        max = count;
//                        num = a[i];
//                        if (num < min) {
//                            min=num;
//                            max = count;
//                        }
//
//                    }
//
//                }
//            }
//
//        }
//
//        System.out.println();
//        if (max > 1) {
//            System.out.println("встречается" + max + " раз  " + min);
//        } else System.out.println("все уник");
//    }


    public static void OneArraysTask9() {
        int[] array = new int[]{3, 3, 1, 1};

        int[] freq = new int[array.length];
        int globalFreqCounter = 0;

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == number) {
                    counter++;
                }
            }
            freq[i] = counter;
            if (counter > globalFreqCounter) {
                globalFreqCounter = counter;
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == globalFreqCounter && array[i] < result) {
                result = array[i];
            }
        }

        System.out.println(result);


    }


    public static void OneArraysTask10(int n) {

        int[] a = new int[n];

        fillIntArray(a);

        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
    }


    public static void print(double[] array) {
        for (double arr : array) {
            System.out.print(arr + "  ");
        }
    }

    private static void fillDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1.0;
        }
    }

    public static void fillIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    static void printInt(int[] array) {
        for (int arr : array) {
            System.out.print(arr + "  ");
        }
    }

}

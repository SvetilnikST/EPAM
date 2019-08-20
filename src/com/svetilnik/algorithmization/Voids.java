package com.svetilnik.algorithmization;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Voids {
    public static void Task1(int a, int b) {
        int nok;
        nok = a * b / (nod(a, b));
        System.out.println(nok);
    }

    public static void Task2(int a, int b, int c, int d) {
        int Z;
        int K;
        int L;

        K = nod(a, b);
        L = nod(c, d);
        Z = nod(K, L);

        System.out.println(Z);
    }

    public static void Task3(int a) {
        double S;
        S = 6 * ((pow((double) a, 2) * (sqrt(3) / 4)));
        System.out.println("Square: " + S);
    }

    public static void Task4(int n) {
        int[] A = new int[n];

        OneDimensionalArrays.fillIntArrayForSort(A);
        OneDimensionalArrays.printInt(A);

        System.out.println("Second by size " + secondBySize(A));
    }

    public static void Task6(int a, int b, int c) {
        int k = nod(a, b);
        int z = nod(k, c);
        if (z == 1) {
            System.out.println(" Mutually Simple");
        } else {
            System.out.println("Not Mutually Simple");
        }

    }

    public static void Task7(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + factorial(i);
            }
        }
        System.out.println("Sum = " + sum);
    }

    //TODO проверь
    public static void Task8(int n, int k, int m) {
        int[] D = new int[n];
        OneDimensionalArrays.fillIntArray(D);
        OneDimensionalArrays.printInt(D);
        int s1 = 0;
        int s2=0;
        for (int i = 0; i < n; i++) {
            if (i == k && i < m) {
                for (int j = k; j < m-k; j++) {
                    s1 = D[j+1] + D[j + 2] + D[j + 3];
                    System.out.print(s1+" ");
                    s1=0;
                }

            }
        }
//        System.out.println(s1);
    }

    public static void Task11(int a, int b) {
        int devider = 10;
        while (a != 0 && b != 0) {
            a = a / devider;
            b = b / devider;
            if (a == 0 && b == 0) {
                System.out.println("Equal.");
                break;
            }
            if (b == 0) System.out.println("In the first.");
            if (a == 0) System.out.println("In the second.");
        }
    }

    protected static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    protected static int secondBySize(int[] A) {
        int max1;
        int max2 = 0;
        for (int i = 2; i < A.length; i++) {
            max1 = A[0];
            max2 = A[1];
            if (A[i] > max2) {
                max2 = A[i];
            }
            if (max2 > max1) {
                int tmp = max1;
                max1 = max2;
                max2 = tmp;
            }
        }
        return max2;
    }


    protected static int nod(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }


}

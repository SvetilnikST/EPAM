package by.svetilnik.epam.b_algorithmization;

import java.util.Arrays;

import static java.lang.Math.*;

public class d_Voids {
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

    public static void Task4() {

//        double[] a = {-1, 6};
//        double[] b = {3, 2};

        double[] a = new double[2];
        double[] b = new double[2];

        double[] c = {-1, 6, 7};
        double[] d = {3, 2, 10};


        for (int i = 0; i < c.length; i++) {

            int max = 0;

            for (int j = 0; j < a.length; j++) {
                a[j] = c[i];
                b[j] = d[i];
            }

            double dist = findDistance(a, b);

        }


        //найдем расстояние между двумя точками
//        printArrayInt(findDistance(a, b));


    }

    private static double findDistance(double[] a, double[] b) {
        double max = 0;
        double[][] rez = new double[2][2];


        int k = 1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < b.length - 1; j++) {

                double z = sqrt(
                        ((b[j] - a[i]) * (b[j] - a[i])) +
                                ((b[j + 1] - a[i + 1]) * (b[j + 1] - a[i + 1]))

                );

                if (z > max) {
                    max = z;

                    rez[0][0] = a[i];
                    rez[0][1] = a[i + 1];
                    rez[1][0] = b[j];
                    rez[1][1] = b[j + 1];
                    System.out.println("Max=" + max);
                }

            }
        }
        return max;
    }

    public static void printArrayInt(double[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void Task5(int n) {
        int[] A = new int[n];
        a_OneDimensionalArrays.fillIntArrayForSort(A);
        a_OneDimensionalArrays.printInt(A);

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

    public static void Task8(int n, int k, int m) {
        int[] D = new int[n];
        int[] sums = new int[3];

        a_OneDimensionalArrays.fillIntArray(D);
        System.out.println(Arrays.toString(D));

        for (int i = k; i < m; i++) {
            if (i == k) {
                sums[0] = sum(D, i);
            }
            if (i == k + 2) {
                sums[1] = sum(D, i);
            }
            if (i == k + 3) {
                sums[2] = sum(D, i);
            }
        }
        System.out.println(Arrays.toString(sums));
    }

    public static int sum(int[] D, int i) {
        return D[i] + D[i + 1] + D[i + 2];
    }

    public static void Task10(int n, int m) {

        int[] rez = getNumbers(n);
        int[] array = new int[m];

        System.out.println("Number: " + n);
        System.out.println(Arrays.toString(rez));

        fillArrayWithNumbers(rez, array);

        System.out.println(Arrays.toString(array));
    }

    public static int[] getNumbers(int n) {
        int[] rez = new int[getCount(n)];

        for (int i = 0; i < rez.length; i++) {
            rez[i] = n % 10;
            n = n / 10;
        }
        return rez;
    }

    public static int getCount(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int[] fillArrayWithNumbers(int[] rez, int[] array) {

        for (int i = 0; i < array.length; ) {
            for (int j = 0; j < rez.length; j++) {

                array[i] = rez[j];
                if (i < array.length - 1) {
                    i++;
                } else {
                    break;
                }
            }
            if (i == array.length - 1) {
                break;
            }

        }
        return array;
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

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
        //исходные данные
        double[] c = {-1, 6, 7};
        double[] d = {3, 2, 10};

        //записываем сюда результат
        double[] a = new double[2];
        double[] b = new double[2];

        double max = 0;

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < d.length; j++) {
                double dist = findDistance(c[i], d[i], c[j], d[j]);
                if (max < dist) {
                    max = dist;
                    a[0] = c[i];
                    b[0] = d[i];
                    a[1] = c[j];
                    b[1] = d[j];
                }
            }
        }
        System.out.print("Max = ");
        System.out.format("%.3f%n", max);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    private static double findDistance(double x1, double y1, double x2, double y2) {
        return sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
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
        if (comprimeNumbers(a, b, c)) {
            System.out.println("true");
        } else System.out.println("false");

    }

    private static boolean comprimeNumbers(int a, int b, int c) {
        int k = nod(a, b);
        int z = nod(k, c);
        return z == 1;
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

    private static int[] getNumbers(int n) {
        int[] rez = new int[getCount(n)];

        for (int i = 0; i < rez.length; i++) {
            rez[i] = n % 10;
            n = n / 10;
        }
        return rez;
    }

    private static int getCount(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }


    private static int getSum(int[] rez) {
        int sum = 0;

        for (int aRez : rez) {
            sum = sum + aRez;
        }
        return sum;
    }


    private static int[] fillArrayWithNumbers(int[] rez, int[] array) {

        for (int i = 0; i < array.length; ) {
            for (int aRez : rez) {
                array[i] = aRez;
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

    public static int Task11(int a, int b) {

        if (getCount(a) > getCount(b)) {
            System.out.println(a);
            return a;
        } else {
            System.out.println(b);
            return b;
        }

    }

    private static int factorial(int n) {
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


    public static void Task12(int k, int n, int from, int to) {

        int getCountNumbers = getCountNumbers(k, n, from, to);
        int[] rez = new int[getCountNumbers];

        fillArrayNumbers(rez, k, n, from, to);

        System.out.println(Arrays.toString(rez));
    }


    public static int getCountNumbers(int k, int n, int from, int to) {

        int[] rez;
        int sum;
        int count = 0;
        int countNumbers = 0;

        for (int i = from; i < to; i++) {

            rez = getNumbers(i);
            sum = getSum(rez);

            if (sum == k) {
                for (int aRez : rez) {
                    if (aRez <= n) {
                        count++;
                    }
                }
                if (count == rez.length) {
                    countNumbers++;
                    count = 0;
                }
            }
        }
        return countNumbers;
    }


    public static void fillArrayNumbers(int[] array, int k, int n, int from, int to) {

        int sum;
        int[] rez;
        int variable = 0;
        int count = 0;

        for (int i = from; i < to; i++) {

            rez = getNumbers(i);
            sum = getSum(rez);

            if (sum == k) {
                for (int aRez : rez) {
                    if (aRez <= n) {
                        variable = i;
                    }
                }
            }

            if (variable == i && variable != 0) {
                array[count] = i;
                count++;
            }
        }
    }


    public static void Task9(double X, double Y, double Z, double T) {
        double S, S1, S2;
        double c;

        c = sqrt(pow(Z, 2) + pow(T, 2));
        S1 = (X + Y) / 2;
        S2 = (c + Z + T) / 2;
        S = S1 + S2;
        System.out.format("%.3f%n", S);
    }

    public static void Task13(int n) {
        int[] array = fillArrayInt(n);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(findPair(array)));

    }

    private static int[] findPair(int[] array) {

        int len = ((array.length - 1) * 2) - 2;

        int[] rez = new int[len];

        int k = 0;

        for (int i = 0; i < rez.length - 1; i += 2) {
            rez[i] = array[k];
            rez[i + 1] = array[k + 2];
            k++;
        }
        return rez;
    }

    private static int[] fillArrayInt(int n) {
        int count = (2 * n) - n;

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = n + i;
        }
        return array;
    }

    public static void Task14(int k) {

        int[] array = new int[k];
        int[] numerals;
        int count;

        fillArrayForArmstrong(array, k);

        for (int anArray : array) {
            numerals = getNumbers(anArray);
            count = getCount(anArray);

            if (armstrong(numerals, count) == anArray) {
                System.out.print(anArray + " ");
            }
        }

    }

    private static void fillArrayForArmstrong(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            array[i] = i + 1;
        }
    }

    private static int armstrong(int[] array, int count) {

        int sum = 0;
        for (int anArray : array) {
            sum = sum + power(anArray, count);
        }
        return sum;
    }


    private static int power(int a, int b) {

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        return result;
    }

    public static void Task15(int n) {
        int to = power(10, n);
        int from = to / 10;

        int[] array = new int[to - from - 1];

        fillArrayForInc(array, from);

        for (int anArray : array) {
            int[] rez = getNumbersInc(anArray);
            int count = getCount(anArray);

            int t = 1;
            for (int j = 0; j < rez.length - 1; j++) {
                if (rez[j + 1] > rez[j]) {
                    t++;
                }
                if (t == count) {
                    System.out.println(anArray);
                    t = 1;
                }
            }
        }
    }


    private static void fillArrayForInc(int[] array, int from) {
        for (int i = 0; i < array.length; i++) {
            array[i] = from + i;
        }
    }

    private static int[] getNumbersInc(int n) {
        int[] rez = new int[getCount(n)];

        for (int i = 0; i < rez.length; i++) {
            rez[rez.length - 1 - i] = n % 10;
            n = n / 10;
        }
        return rez;
    }


    public static void Task16(int n) {
        int to = power(10, n);
        int from = to / 10;
        int[] array = new int[to - from - 1];
        int sum = 0;
        int countInSum;

        fillArrayForInc(array, from);

        for (int anArray : array) {
            int[] rez = getNumbersInc(anArray);
            int count = getCount(anArray);
            int t = 0;

            for (int aRez : rez) {
                if (aRez % 2 == 0) {
                    t++;
                }
                if (t == count) {
                    sum = sum + anArray;
                    t = 1;
                }
            }
        }
        countInSum = getCountEvensNumberInSum(sum);
        System.out.print("Sum: " + sum + ";");
        System.out.println("The number evens in sum: " + countInSum);
    }

    private static int getCountEvensNumberInSum(int sum) {
        int countSum = 0;
        int[] rez = getNumbersInc(sum);

        for (int aRez : rez) {
            if (aRez % 2 == 0 && aRez != 0) {
                countSum++;
            }
        }
        return countSum;
    }

    public static void Task17(int k) {
        int[] rez = getNumbersInc(k);

        int sumEl = getSumArray(rez);

        int count = 1;

        while (k > sumEl) {
            k = k - sumEl;
            count++;
        }

    }


    public static int getSumArray(int[] rez) {
        int sum = 0;

        for (int anRez : rez) {
            sum = sum + anRez;
        }
        return sum;
    }
}
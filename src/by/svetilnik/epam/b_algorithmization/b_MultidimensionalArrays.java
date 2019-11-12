package by.svetilnik.epam.b_algorithmization;

import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.pow;

/**
 * Задачи. Массивы массивов
 */

public class b_MultidimensionalArrays {

    public static void MultidimensionalArrays1(int n, int m, int min, int max) {

        int[][] matrix = new int[n][m];

        fillRandom(matrix, min, max);
        printArrayInt(matrix);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (j % 2 != 0 && matrix[0][j] > matrix[n - 1][m - 1]) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void MultidimensionalArrays2(int n, int min, int max) {

        int[][] matrix = new int[n][n];

        fillRandom(matrix, min, max);
        printArrayInt(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    public static void MultidimensionalArrays3(int n, int m, int k, int p, int min, int max) {

        int[][] matrix = new int[n][m];

        fillRandom(matrix, min, max);
        printArrayInt(matrix);

        System.out.print(k + "-row: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == k) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println(p + "-column ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == p) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void MultidimensionalArrays4(int n) {

        int[][] array = new int[n][n];
        int k = 1;
        int num = n;

        fillInt(array);
        printArrayInt(array);

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {

                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = k;
                    k++;
                }
                k = 1;
            } else {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = num;
                    num--;
                }
                num = n;
            }
        }
        printArrayInt(array);
    }

    public static void MultidimensionalArrays5(int n) {
        int[][] array = new int[n][n];
        int k = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = k;
            }
            k++;
        }

        printArrayInt(array);

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j < n; j++) {
                array[i][j] = 0;
            }
        }

        printArrayInt(array);
    }

    public static void MultidimensionalArrays6(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 1;
            }
        }

        int k = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j && i < n / 2) {
                    k++;
                }
            }
            if (k > 0) {
                for (int m = 0; m < k; m++) {
                    array[i][m] = 0;
                    array[i][n - m - 1] = 0;
                    array[n - i - 1][m] = 0;
                    array[n - i - 1][n - m - 1] = 0;
                }
                k = 0;
            }
        }
        printArrayInt(array);
    }

    public static void MultidimensionalArrays7(int n) {

        double[][] array = new double[n][n];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                array[i][j] = Math.sin(pow(i, 2) - pow(j, 2)) / n;

                System.out.printf("%.4f ", array[i][j]);

                if (array[i][j] > 0.0) count++;
            }
            System.out.println();
        }
        System.out.println("Count positive elements = " + count);
    }

    //TODO add Scanner
    public static void MultidimensionalArrays8(int n, int a, int b, int min, int max) {

        int[][] array = new int[n][n];
        int k;

        fillRandom(array, min, max);
        printArrayInt(array);

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                k = array[i][a];
                array[i][a] = array[i][b];
                array[i][b] = k;
            }
        }
        printArrayInt(array);
    }


    public static void MultidimensionalArrays9(int n, int min, int max) {

        int sum = 0;
        int maxSum = 0;
        int number = 0;

        int[][] array = new int[n][n];

        fillRandom(array, min, max);
        printArrayInt(array);

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                sum = sum + array[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                number = j;
            }
            sum = 0;
        }
        System.out.println("MaxSum in " + number + " = " + maxSum);
    }

    public static void MultidimensionalArrays10(int n, int min, int max) {

        int[][] array = new int[n][n];

        fillRandom(array, min, max);
        printArrayInt(array);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && array[i][j] > 0.0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

    public static void MultidimensionalArrays11(int n, int m, int min, int max) {

        int[][] array = new int[n][m];
        int count;

        fillRandom(array, min, max);
        printArrayInt(array);

        for (int i = 0; i < n; i++) {

            count = 0;

            for (int j = 0; j < m; j++) {
                if (array[i][j] == 5) count++;
            }
            if (count > 3 || count == 3) System.out.println("Number row: " + i);
        }
    }

    public static void MultidimensionalArrays12(int n, int min, int max) {

        int[][] array = new int[n][n];

        System.out.println("Array: ");
        fillRandom(array, min, max);
        printArrayInt(array);

        System.out.println("Desk Row: ");
        descRow(array, n);

        printArrayInt(array);

        System.out.println("Inc Row: ");
        incRow(array, n);

        printArrayInt(array);

    }

    public static void MultidimensionalArrays13(int n, int min, int max) {

        int[][] array = new int[n][n];

        fillRandom(array, min, max);

        System.out.println("Array: ");
        printArrayInt(array);

        System.out.println("Desk Column: ");
        descColumn(array, n);
        printArrayInt(array);

        System.out.println("Inc Column: ");
        incColumn(array, n);
        printArrayInt(array);
    }

    public static void MultidimensionalArrays14(int m, int n) {
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                if (i == j || i > j) {
                    arr[i][j] = 0;
                } else arr[i][j] = 1;
            }
        }
        printArrayInt(arr);

    }


    public static void MultidimensionalArrays15(int m, int n, int min, int max) {

        int[][] array = new int[m][n];
        int maxEl = array[0][0];

        fillRandom(array, min, max);
        printArrayInt(array);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] > maxEl) {
                    maxEl = array[i][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = maxEl;
                }
            }
        }

        printArrayInt(array);
    }

    //TODO Think about it
    public static void MultidimensionalArrays16(int n) {
        int[][] arr = new int[n][n];

        System.out.println("Ishodniy massiv: ");
        GenerateArray(arr);
        PrintArray(arr);
        System.out.println("Magicheskiy kvadrat: ");
        ReverseArray1(arr);
        ReverseArray2(arr);

//        //сумма в строке
//        System.out.println(sumInStr(arr));
//        int sumInStr = sumInStr(arr);
//        int s = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            s = s + arr[0][i];
//        }
//        if (s == sumInStr) {
//            System.out.println("true");
//        } else System.out.println("false");
//

        PrintArray(arr);
    }

//    private static int sumInStr(int[][] arr) {
//        return sum(arr) / arr.length;
//    }
//
//    private static int sum(int[][] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                sum = sum + arr[i][i];
//            }
//        }
//        return sum;
//    }


    public static void PrintArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void GenerateArray(int a[][]) {
        int k = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = k;
                k++;
            }
        }
    }

    public static void ReverseArray1(int a[][]) {
        int t;
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length / 2; j++) {
                if (i == j) {
                    t = a[i][j];
                    a[i][j] = a[a.length - 1 - i][a.length - 1 - j];
                    a[a.length - 1 - i][a.length - 1 - j] = t;
                }
            }
        }
    }

    public static void ReverseArray2(int a[][]) {
        int t;
        for (int i = 0, j = a.length - 1 - i; i <= (a.length / 2) - 1; ++i, --j) {
            t = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = t;
        }
    }


    /**
     * methods called in tasks
     */

    public static void printArrayInt(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void fillInt(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = i + 1;
            }

        }
    }

    private static void fillRandom(int[][] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random(min, max);
            }
        }
    }

    private static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    private static void incRow(int[][] array, int n) {
        int number;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < (n - i - 1); j++) {
                    if (array[k][j] > array[k][j + 1]) {
                        number = array[k][j];
                        array[k][j] = array[k][j + 1];
                        array[k][j + 1] = number;
                    }
                }
            }
        }
    }

    private static void descRow(int[][] array, int n) {
        int number;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < (n - i - 1); j++) {
                    if (array[k][j] < array[k][j + 1]) {
                        number = array[k][j];
                        array[k][j] = array[k][j + 1];
                        array[k][j + 1] = number;
                    }
                }
            }
        }
    }

    private static void incColumn(int[][] array, int n) {
        int number;
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n - 1; j++) {
                for (int i = 0; i < n - 1 - j; i++) {
                    if (array[i][k] > array[i + 1][k]) {
                        number = array[i][k];
                        array[i][k] = array[i + 1][k];
                        array[i + 1][k] = number;
                    }
                }
            }
        }
    }

    private static void descColumn(int[][] array, int n) {
        int number;
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n - 1; j++) {
                for (int i = 0; i < n - 1 - j; i++) {
                    if (array[i][k] < array[i + 1][k]) {
                        number = array[i][k];
                        array[i][k] = array[i + 1][k];
                        array[i + 1][k] = number;
                    }
                }
            }
        }
    }


    public static void MultidimensionalArrays16test(int n) {

        int [][] array = new int[n][n];

        //ищем магическую сумму
        int magic = 15;

        //цикл прохождения по главной диаганали
        int sumGeneral =0;
        for (int i = 0; i < n; i++) {
            sumGeneral += array[i][i];
        }

        if(sumGeneral == magic){

            //переходим к проходу по строкам
            int sumUnGeneral = 0;
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {
                    sumUnGeneral += array[i][j];
                }

                if(sumUnGeneral == magic){
                    //вот тут идем дальше, иначе нужно делать перестановку
                }
            }
        }else
            System.out.println("делаем перестановку по главной диаганали");
    }


}

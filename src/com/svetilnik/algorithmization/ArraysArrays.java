package com.svetilnik.algorithmization;

import static java.lang.Math.pow;

public class ArraysArrays {
    public static void ArraysArraysTast1(int n, int m) {

        int[][] matrix;
        matrix = new int[n][m];
        matrix[0][0] = 1;
        matrix[0][1] = 22;
        matrix[0][2] = 3;
        matrix[0][3] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 1;
        matrix[1][2] = 7;
        matrix[1][3] = 7;

        matrix[2][0] = 5;
        matrix[2][1] = 3;
        matrix[2][2] = 9;
        matrix[2][3] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j % 2 != 0 && matrix[0][j] > matrix[n - 1][m - 1]) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void ArraysArraysTast2(int n, int m) {
        int[][] matrix = new int[n][m];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }


    public static void ArraysArraysTast3(int n, int m, int k, int p) {

        int[][] matrix = new int[n][m];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(k + "-row ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == k) {
                    System.out.print(matrix[i][j] + " ");
                }

            }
        }
        System.out.println();
        System.out.println();
        System.out.println(p + "-column ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == p) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }


    public static void ArraysArraysTast4(int n) {

        int[][] array = new int[n][n];
        int k = 1;
        int num = n;

        fillInt(array);
        printArrayInt(array);
        System.out.println();

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


    public static void ArraysArraysTask5(int n) {
        int[][] array = new int[n][n];

        System.out.println();
        int k = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = k;
            }
            k++;
        }
        printArrayInt(array);
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j < n; j++) {
                array[i][j] = 0;
            }

        }
        printArrayInt(array);

    }

    //TODO
    public static void ArraysArraysTask6(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 1;

            }
        }

        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - i; j < n; j++) {
                array[i][j] = 0;

            }
        }
        printArrayInt(array);
    }


    public static void ArraysArraysTask7(int n) {

        double[][] array = new double[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.sin(pow(i, 2) - pow(j, 2)) / n;
                System.out.printf("%.4f ", array[i][j]);
                if (array[i][j] > 0.0) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("Count positive elements = " + count);
    }

    public static void ArraysArraysTask8(int n, int a, int b) {
        int[][] array = new int[n][n];
        int k;
        fillIntNew(array);

        printArrayInt(array);
        System.out.println();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                k = array[i][a];
                array[i][a] = array[i][b];
                array[i][b] = k;
            }
        }
        printArrayInt(array);
    }


    public static void ArraysArraysTask9(int n) {
        int sum = 0;
        int maxSum = 0;
        int number = 0;

        int[][] array = new int[n][n];

        fillIntNew(array);
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


    public static void ArraysArraysTask10(int n) {

        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = i + 1;
            }

        }

        printArrayInt(array);

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && array[i][j] > 0.0) {
                    System.out.print(array[i][j]);
                }
            }
        }
    }

    public static void ArraysArraysTask11() {
        int n = 10;
        int m = 20;
        int[][] array = new int[n][m];
        int min = 0;
        int max = 15;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random(min, max);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "         ");
            }
            System.out.println();
        }

        int count;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < m; j++) {
                if (array[i][j] == 5) count++;
            }
            if (count > 3 || count == 3) System.out.println("Number row: " + i);
        }
    }

    public static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }


    public static void fillInt(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = i + 1;
            }

        }
    }

    public static void fillIntNew(int[][] array) {
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
    }

    private static void printArrayInt(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }


    public static void ArraysArraysTask12(int n) {
        int[][] array = new int[n][n];
        fillIntNew(array);
        printArrayInt(array);
        descRow(array, n);
        System.out.println();
        printArrayInt(array);

        incRow(array, n);
        System.out.println();
        printArrayInt(array);

    }


    public static void ArraysArraysTask13(int n) {
        int[][] array = new int[n][n];
        fillIntNew(array);
        System.out.println("Array: ");
        printArrayInt(array);

        descColumn(array, n);

        System.out.println("Desk Column: ");
        printArrayInt(array);

        System.out.println("Inc Column: ");
        incColumn(array,n);
        printArrayInt(array);

    }


    public static void ArraysArraysTask15(int m, int n) {
        int[][] array = new int[m][n];
        int max = array[0][0];

        fillIntNew(array);
        printArrayInt(array);
        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }

        printArrayInt(array);
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
                for (int i = 0; i < n - 1-j; i++) {
                    if (array[i][k]> array[i + 1][k]) {
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
                    for (int i = 0; i < n - 1-j; i++) {
                    if (array[i][k]< array[i + 1][k]) {
                        number = array[i][k];
                        array[i][k] = array[i + 1][k];
                        array[i + 1][k] = number;
                    }
                }
            }
        }
    }





}

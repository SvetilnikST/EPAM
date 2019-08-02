package com.svetilnik.algorithmization;

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



    public static void ArraysArraysTast4(int n, int m, int k, int p) {

    }
}

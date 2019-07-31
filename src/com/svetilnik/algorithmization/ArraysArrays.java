package com.svetilnik.algorithmization;

public class ArraysArrays {
    public static void ArraysArraysTast1(int n, int m) {

        int[][] matrix;
        matrix = new int[n][m];

        matrix[0][0] = 1;
        matrix[0][1] = -22;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 1;
        matrix[1][2] = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j += 2) {

                if (matrix[0][1] > matrix[n-1][m-1]) {

                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }
}

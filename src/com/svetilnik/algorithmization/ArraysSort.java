package com.svetilnik.algorithmization;

public class ArraysSort {

    public static void ArraysSort1(int k) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{10, 20, 30};
        int[] c = new int[a.length + b.length];
        int z=0;

        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < k+1; j++) {
                c[j]=a[j];
            }

            for (int j = k+1; j <c.length; j++,z++) {
                if (z==b.length){break;}
                c[j]=b[z];
            }

            for (int j = k+1; j <a.length ; j++) {
                c[j+b.length]=a[j];
            }
        }

        OneDimensionalArrays.printInt(c);
    }


    public static void ArraysSort3(int n) {
        int[] a = new int[n];

        OneDimensionalArrays.fillIntArray(a);
        OneDimensionalArrays.printInt(a);

        System.out.println();
        System.out.println("Sort array:");
        for (int left = 0; left < a.length; left++) {
            int maxInd = left;
            for (int i = left; i < a.length; i++) {
                if (a[i] > a[maxInd]) {
                    maxInd = i;
                }
            }
            swap(a, left, maxInd);
            System.out.print(a[left] + "  ");
        }

    }

    public static void ArraysSort4(int n) {
        int[] a = new int[n];

        OneDimensionalArrays.fillIntArray(a);
        OneDimensionalArrays.printInt(a);

        System.out.println();
        System.out.println("Sort array:");
    }


    /*
    metods for task
     */
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }


}

package com.svetilnik.algorithmization;

public class ArraysSort {


    //TODO Hren
    public static void ArraysSort1(int n, int m) {
        int[] a = new int[n];
        int[] b = new int[m];

        int k = 1;
        int u = 1;

        for (int i = 0; i < n; i++) {
            a[i] = u;
            u++;
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < m; i++) {
            b[i] = u + 10;
            u++;
            System.out.print(b[i] + " ");
        }


        for (int i = 0; i < m; i++) {
           n=n+1;
            for (int j = n; j <k+i+1 ; j++) {
                a[j]= b[j-1];
                a[k+i]= b[i];
            }
        }
        int o = 0;
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }


    public static void ArraysSort3(int n) {
        int [] a = new int[n];

        OneDimensionalArrays.fillIntArray(a);
        OneDimensionalArrays.printInt(a);

        System.out.println();
        System.out.println("Sort array:");
        for (int left = 0; left < a.length; left++) {
            int maxInd = left;
            for (int i = left; i <a.length ; i++) {
                if(a[i]>a[maxInd]){
                    maxInd=i;
                }
            }
            swap(a,left,maxInd);
            System.out.print(a[left]+"  ");
        }

    }



    /*
    metods for task
     */
    private static void swap(int [] array, int ind1, int ind2){
        int tmp = array[ind1];
        array[ind1]= array[ind2];
        array[ind2]= tmp;
    }




}

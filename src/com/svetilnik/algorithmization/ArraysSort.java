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


        for (int i = 0; i < n; i++) {
            if (i == k) {
                for (int j = 0; j < m; j++) {
                        a[i+1] = b[j];
                    n++;
                    break;
                }
            }
        }
        int o = 0;
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }


//        for (int i = 0; i < a.length + b.length; i++) {
//            if(i==k){
//                int l = i;
//                for (int j = 0; j < b.length; j++) {
//                    a[i]=b[j];
//                }
//            }
//        }
//
//
//        for (int i = 0; i < a.length + b.length; i++) {
//            System.out.println(a[i]);
//        }
    }


}

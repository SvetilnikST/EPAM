package by.svetilnik.epam.b_algorithmization;

import java.util.Arrays;

/**
 * Задачи одномерные массивы. Сортировки
 */
public class c_ArraysSort {

    public static void ArraysSort1(int k) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{10, 20, 30};
        int[] c = new int[a.length + b.length];
        int z = 0;

        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < k + 1; j++) {
                c[j] = a[j];
            }

            for (int j = k + 1; j < c.length; j++, z++) {
                if (z == b.length) {
                    break;
                }
                c[j] = b[z];
            }

            for (int j = k + 1; j < a.length; j++) {
                c[j + b.length] = a[j];
            }
        }

        a_OneDimensionalArrays.printInt(c);
    }

    public static void ArraysSort2() {

        int[] a = new int[]{1, 3, 7, 10};
        int[] b = new int[]{2, 3, 6};
        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;

        for (int k = 0; k < c.length; k++) {

            if(i>a.length-1){
                int tmp = b[j];
                c[k]=tmp;
                j++;
            }
            else if(j>b.length-1){
                int tmp = a[i];
                c[k] = tmp;
                i++;
            }
            else if(a[i]<b[j]){
                int tmp = a[i];
                c[k]=tmp;
                i++;
            }else {
                int p = b[j];
                c[k]=p;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }

    //Сортировка выбором
    public static void ArraysSort3(int n) {
        int[] a = new int[n];

        a_OneDimensionalArrays.fillIntArray(a);
        a_OneDimensionalArrays.printInt(a);

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

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    //сортировка обмена
    public static void ArraysSort4(int n) {
        int[] array = new int[n];
        boolean sorted = false;
        int count = 0;

        a_OneDimensionalArrays.fillIntArrayForSort(array);
        System.out.println(Arrays.toString(array));

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                    sorted = false;
                }
            }
        }
        System.out.println("Count: " + count);
        System.out.println(Arrays.toString(array));
    }

    /*
    metods for task
     */


    //сортировка вставками
    public static void test() {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int tmp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = tmp;
            }
        }

        System.out.println(Arrays.toString(array));
    }


    public static void test1() {
        int[] array = new int[]{1, 4, 6};
        int[] newArray = crateArray(array);

        System.out.println(Arrays.toString(newArray));

        sort(array, 5);


    }

    private static void sort(int[] array, int n) {
        int counter = 0;

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                counter++;
                int tmp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = tmp;
            }

        }
        System.out.println(Arrays.toString(array));
    }

    private static int[] crateArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] + 1;
        }
        return newArray;
    }


}

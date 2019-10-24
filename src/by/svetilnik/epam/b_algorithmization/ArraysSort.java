package by.svetilnik.epam.b_algorithmization;

/**
 * Задачи одномерные массивы. Сортировки
 */
public class ArraysSort {

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

        OneDimensionalArrays.printInt(c);
    }

    public static void ArraysSort2() {

        int[] a = new int[]{1, 3, 7, 10};
        int[] b = new int[]{2, 3, 6};
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length - 1; ) {
            for (int j = 0; j < b.length - 1; ) {
                for (int k = 0; k < c.length-1; ) {

                    if (a[i] == b[j]) {
                        c[k] = a[i];
                        c[k + 1] = b[j];
                        k = k + 2;
                        i++;
                        j++;
                    } else if (a[i] < b[j]) {
                        c[k] = a[i];
                        i++;
                        k++;
                    } else {
                        c[k] = b[j];
                        k++;
                        if (j < b.length - 1) {
                            j++;
                        }

                        if (j == b.length - 1) {
                            c[k] = a[i];
                            k++;
                            if (i < a.length - 1) {
                                i++;
                            }
                        }
                        if(j==b.length-1 && i==a.length-1){
                            c[k]=a[i];
                        }
                    }
                }
            }
        }

        for (int value : c) {
            System.out.print(value + " ");
        }


    }

    //Сортировка выбором
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

    //Сортировка обменами
    public static void ArraysSort4(int n) {
        int[] a = new int[n];
        int count = 0;

        OneDimensionalArrays.fillIntArrayForSort(a);
        OneDimensionalArrays.printInt(a);
        System.out.println("Sort array:");

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    count++;
                }
            }
        }

        OneDimensionalArrays.printInt(a);
        System.out.println("Count swap = " + count);
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

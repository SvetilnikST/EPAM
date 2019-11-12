package by.svetilnik.epam.b_algorithmization;

import java.util.Arrays;

import static by.svetilnik.epam.b_algorithmization.b_MultidimensionalArrays.printArrayInt;

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

            if (i > a.length - 1) {
                int tmp = b[j];
                c[k] = tmp;
                j++;
            } else if (j > b.length - 1) {
                int tmp = a[i];
                c[k] = tmp;
                i++;
            } else if (a[i] < b[j]) {
                int tmp = a[i];
                c[k] = tmp;
                i++;
            } else {
                int p = b[j];
                c[k] = p;
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


    //сортировка вставками
    public static void ArraysSort5() {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        int[] rezult = insertSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(rezult));
    }

    private static int[] insertSort(int[] array) {
        int[] destinationArray = new int[array.length];
        int destinationSize = 0;
        for (int n = 0; n < array.length; n++) {

            // Ищем место для вставки
            // Мы просто просматриваем все элементы
            int insertIndex = 0;
            if (destinationSize > 0) {
                while (insertIndex < destinationSize
                        && destinationArray[insertIndex] < array[n]) {
                    insertIndex++;
                }
            }
            // Вставка
            for (int m = destinationSize - 1; m >= insertIndex; m--) {
                destinationArray[m + 1] = destinationArray[m];
            }
            destinationArray[insertIndex] = array[n];
            destinationSize++;
        }
        return destinationArray;
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


    private static int binarySearth(int arr[], int firstElement, int lastElement, int elementToSearth) {

        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - lastElement) / 2;

            if (arr[mid] == elementToSearth) {
                return mid;
            }

            if (arr[mid] > elementToSearth)
                return binarySearth(arr, firstElement, mid - 1, elementToSearth);
            return binarySearth(arr, mid + 1, lastElement, elementToSearth);
        }
        return -1;
    }


    public static void ArraysSort6() {

        int[] array = {32, 95, 16, 82, 24, 66, 35, 19};
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] shellSort(int[] array) {

        int h = 1;
        int n = array.length;
        while (h < n / 3)
            h = (3 * h) + 1;

        while (h >= 1) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    int tmp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = tmp;
                }
            }
            h = h / 3;
        }

        return array;
    }

    public static void ArraysSort7() {

        int[] a = new int[]{2, 3, 7, 10};
        int[] b = new int[]{1, 6};
        int[] c = new int[a.length + b.length];

        int[] place = new int[b.length];

        int i = 0;
        int j = 0;
        int z = 0;

        for (int k = 0; k < c.length; k++) {

            if (i > a.length - 1) {
                int tmp = b[j];
                c[k] = tmp;
                j++;
                place[z] = k;
                z++;
            } else if (j > b.length - 1) {
                int tmp = a[i];
                c[k] = tmp;
                i++;
            } else if (a[i] < b[j]) {
                int tmp = a[i];
                c[k] = tmp;
                i++;
            } else {
                int p = b[j];
                c[k] = p;
                j++;
                place[z] = k;
                z++;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println("Places: " + Arrays.toString(place));
    }

    //Алгоритм Евклида по нахождени общего делители НОД
    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void ArraysSort8(int n) {

        int[] numerators = new int[n];
        int[] denominators = new int[n];
        int nok;

        generateFraction(n, numerators, denominators);

        nok = findNok(denominators);

        findNumerators(numerators, findAdditionalFactor(nok, denominators));

        shellSort(numerators);

        printArrayInt(returnFractions(nok, numerators));
    }

    public static void generateFraction(int n, int[] numerators, int[] denominators) {
        int a = 1;
        int b = 100;
        for (int i = 0; i < n; ++i) {
            numerators[i] = a + (int) (Math.random() * b);
            denominators[i] = a + (int) (Math.random() * b);
        }
        System.out.println(Arrays.toString(numerators));
        System.out.println(Arrays.toString(denominators));
    }

    public static int findNok(int[] denominators) {
        int m = 0;
        for (int i = 0; i < denominators.length - 1; i++) {
            int k = nok(denominators[i], denominators[i + 1]);
            if (k > m || k == m) {
                m = k;
            } else return 0;
        }
        return m;
    }

    public static int nok(int a, int b) {
        return a * b / (nod(a, b));
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

    public static int[] findAdditionalFactor(int nok, int[] denominators) {

        int[] additionalFactors = new int[denominators.length];
        for (int i = 0; i < denominators.length; i++) {
            additionalFactors[i] = nok / denominators[i];
        }
        return additionalFactors;
    }

    public static void findNumerators(int[] numerators, int[] additionalFactors) {
        for (int i = 0; i < numerators.length; i++) {
            numerators[i] = numerators[i] * additionalFactors[i];
        }
    }

    public static int[][] returnFractions(int nok, int[] numerators) {
        int[][] rez = new int[numerators.length][numerators.length];
        for (int i = 0; i < numerators.length; i++) {
            rez[0][i] = numerators[i];
            rez[1][i] = nok;
        }
        return rez;
    }


}

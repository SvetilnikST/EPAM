package com.svetilnik.algorithmization;

public class Voids {
    public static void Task1(int a, int b) {
        int nok;
        nok = a * b / (nod(a, b));
        System.out.println(nok);
    }

    public static void Task2(int a, int b, int c, int d) {
        int Z;
        int K;
        int L;

        K = nod(a, b);
        L = nod(c, d);
        Z = nod(K, L);

        System.out.println(Z);
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
}

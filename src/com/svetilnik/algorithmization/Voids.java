package com.svetilnik.algorithmization;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

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

    public static void Task3(int a) {
        double S;
        S = 6 * ((pow((double) a, 2) * (sqrt(3) / 4)));
        System.out.println("Square: " + S);
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

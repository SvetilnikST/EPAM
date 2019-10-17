package by.svetilnik.epam.d_classes.simpleClasses.task7;

import java.util.ArrayList;



public class Triangel {

    public static final int countTop = 3;

    private int a;
    private int b;
    private int c;
    private int height;
    private ArrayList<Top> tops = new ArrayList<>(countTop);

    public Triangel() {
        this.a = 3;
        this.b = 3;
        this.c = 4;
        this.height = 4;
        tops.add(new Top(1,1));
        tops.add(new Top(2,2));
        tops.add(new Top(3,3));

    }

    public Triangel(int a, int b, int c, int height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area() {
        return (this.getA() * this.getHeight()) / 2;
    }
}

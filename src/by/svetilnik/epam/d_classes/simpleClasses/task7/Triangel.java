package by.svetilnik.epam.d_classes.simpleClasses.task7;

import java.util.ArrayList;

public class Triangel {

    private int a;
    private int b;
    private int c;
    private int height;

    public Triangel() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
        this.height = 4;
        ArrayList<Top> tops = new ArrayList<>();
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
}

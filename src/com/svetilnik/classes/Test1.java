package com.svetilnik.classes;

public class Test1 {
    public int t1;
    public int t2;

    public Test1() {
    }

    public void print() {
        System.out.println("t1 = " + t1 + " t2 = " + t2);
    }

    public void setParam(int t1, int t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public int sum() {
        return t1 + t2;
    }

    public int ret() {
        if (t1 > t2) return t1;
        else return t2;
    }

};





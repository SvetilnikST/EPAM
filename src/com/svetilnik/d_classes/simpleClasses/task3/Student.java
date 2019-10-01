package com.svetilnik.d_classes.simpleClasses.task3;

public class Student {

    public static final int SIZE =5;

    public String fullName;
    public String groupNumber;
    public int[] progress1 = new int[SIZE];

    public Student() {
    }

    public Student(String fullName, String groupNumber, int[] progress1) {
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.progress1 = progress1;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getProgress1() {
        return progress1;
    }

    public void setProgress1(int[] progress1) {
        this.progress1 = progress1;
    }
}

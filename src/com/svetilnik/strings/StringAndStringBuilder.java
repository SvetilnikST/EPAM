package com.svetilnik.strings;

public class StringAndStringBuilder {
    public static void Task1() {
        String line = "m n  k    jn     ";
        boolean space = false;
        int max=0;
        int count = 0;


        for (int i = 0; i <line.length(); i++) {
            if (line.charAt(i) == ' ') {
                count = count+1;
            } else {
                if (count > max) {
                    max = count;
                    count = 0;
                }
            }
        }


        System.out.println(max);
    }
}

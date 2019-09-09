package com.svetilnik.strings;

public class StringAndStringBuilder {

    public static void Task1() {
        String line = "m jn  fd        ";
        int max = 0;
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                count = count + 1;
            } else if (count > max) {
                max = count;
                count = 0;
            }
        }
        if (count > max) {
            max = count;
        }
        System.out.println(max);
    }

    public static void Task2() {
        StringBuffer stringBuffer = new StringBuffer("a a a ");
        System.out.println(stringBuffer);
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == 'a') {
                stringBuffer.insert(i + 1, "b");
            }
        }
        System.out.println(stringBuffer);
    }

    public static boolean Task3(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void Task4() {
        String informatics = "информатика";
        String t = String.valueOf(informatics.charAt(7));
        String o = String.valueOf(informatics.charAt(3));
        String r = String.valueOf(informatics.charAt(4));
        String tort = t + o + r + t;
        System.out.println(tort);
    }

    public static void Task5(String string) {

        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Count 'a' in string = "+count);
    }

}

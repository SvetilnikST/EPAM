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



   public static boolean Task3(String s){
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

}

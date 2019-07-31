package com.svetilnik.strings;

public class StringsAsArray {



    public static void stringsAsArrayTask3(){



    }

    //неправильно. нужно как с массивом символов
    public static void stringsAsArrayTask5(String s) {

        String str = s.replaceAll("\\s{2,}", " ").trim();

        System.out.println(str);
    }
}

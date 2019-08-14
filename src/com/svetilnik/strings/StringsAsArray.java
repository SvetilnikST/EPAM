package com.svetilnik.strings;

public class StringsAsArray {



    public static void stringsAsArrayTask2(){
        String str = "Starts word replace word word.";
        String forReplace = "word";
        String replacementValue = "letter";
        System.out.println(str);
        System.out.println(str.replace(forReplace, replacementValue));
    }

    //неправильно. нужно как с массивом символов
    public static void stringsAsArrayTask5(String s) {

        String str = s.replaceAll("\\s{2,}", " ").trim();

        System.out.println(str);
    }
}

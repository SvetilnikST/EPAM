package com.svetilnik.strings;

public class StringsAsArray {

    public static void stringsAsArrayTask1(){


        String str = "camelCase";
        str = str.toLowerCase();

        System.out.println(str);

    }


    public static void stringsAsArrayTask2(){
//        String str = "Starts word replace word word.";
//        String forReplace = "word";
//        String replacementValue = "letter";
//        System.out.println(str);
//        System.out.println(str.replace(forReplace, replacementValue));

       String  [] strings = new String[]{"Start", "word", "replace", "word", "word"};
        String forReplace = "word";
        String replacementValue = "letter";
        for (int i = 0; i < strings.length; i++) {
            if(strings[i]==forReplace){
                strings[i]=replacementValue;

            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+" ");
        }




    }

    //неправильно. нужно как с массивом символов
    public static void stringsAsArrayTask5(String s) {

        String str = s.replaceAll("\\s{2,}", " ").trim();

        System.out.println(str);
    }
}

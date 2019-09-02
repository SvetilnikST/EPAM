package com.svetilnik.strings;

/**
 * Работа со строкой как с массивом символов
 */
public class StringsAsArray {

    public static void stringsAsArrayTask1() {

        String[] camelCase = new String[]{"karaMara", "helloWorld", "lizaMop", "optRew"};
        String[] snake_case = new String[camelCase.length];

        int codeSymbol = 95;
        int cons = 32;
        int asciiFrom = 40;
        int asciiDo = 91;

        for (int j = 0; j < camelCase.length; j++) {

            char[] result = camelCase[j].toCharArray();
            char[] newrez = new char[result.length + 1];

            int k = 0;
            for (int i = 0; i < result.length; i++) {
                if (result[i] > asciiFrom && result[i] < asciiDo) {
                    newrez[k] = (char) ((int) codeSymbol);
                    newrez[k + 1] = (char) ((int) result[i] + cons);
                    k = k + 1;
                } else
                    newrez[k] = result[i];
                k++;
            }
            String str = new String(newrez);
            snake_case[j] = str;
        }

        System.out.println("camelCase: ");
        for (String sCase : camelCase) {
            System.out.print(sCase + " ");
        }

        System.out.println();
        System.out.println("snake_case: ");
        for (String aSnake : snake_case) {
            System.out.print(aSnake + " ");
        }

    }


    public static void stringsAsArrayTask2() {
//        String str = "Starts word replace word word.";
//        String forReplace = "word";
//        String replacementValue = "letter";
//        System.out.println(str);
//        System.out.println(str.replace(forReplace, replacementValue));

//        String[] strings = new String[]{"Start", "word", "replace", "word", "word"};
//        String forReplace = "word";
//        String replacementValue = "letter";
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i] == forReplace) {
//                strings[i] = replacementValue;
//
//            }
//        }
//
//        for (int i = 0; i < strings.length; i++) {
//            System.out.print(strings[i] + " ");
//        }

        String string = "String word word jkl word";

        System.out.println(string.contains("word"));

        char[] chars = {'w', 'o', 'r', 'd'};
        char[] latter = {'l', 'a', 't', 't','e','r'};
        char[] charsString = string.toCharArray();

        int k = 0;

        for (int i = 0; i < charsString.length; i++) {
            if (charsString[i] == chars[k] && charsString[i + 1] == chars[k + 1] && charsString[i + 2] == chars[k + 2] && charsString[i + 3] == chars[k + 3]) {
                charsString[i]=latter[k];
            }
        }

        for (char c: charsString) {
            System.out.print(c);
        }

    }

    public static void stringsAsArrayTask5(String s) {
        System.out.println(s);
        String str = s.trim();
        int count = 0;
        int k = 1;
        String s1, s2;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                count++;
            } else {
                if (count > 1) {
                    s1 = str.substring(0, i - count);
                    s2 = str.substring(i - k, str.length());
                    str = s1 + s2;
                    i = 0;
                }
                count = 0;
            }
        }
        System.out.println(str);
    }

    public static void stringsAsArrayTask6() {
        String[] str = new String[]{"1235648 dvfvdf1245 dl,;ls"};
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            char[] chars = str[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {

                if (chars[j] >= '1' && chars[j] <= '9') {
                    count++;
                }
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
        System.out.println("Coutnt number = " + count);
    }


}

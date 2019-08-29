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

        String[] strings = new String[]{"Start", "word", "replace", "word", "word"};
        String forReplace = "word";
        String replacementValue = "letter";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == forReplace) {
                strings[i] = replacementValue;

            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

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


    //неправильно. нужно как с массивом символов
    public static void stringsAsArrayTask5(String s) {
        System.out.println(s);
        System.out.println("--------");
//        String str = s.replaceAll("\\s{2,}", " ").trim();

        String str = s.trim();
        char[] chars = str.toCharArray();

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count++;
                if (count > 1) {
                    removeCharAt(str, i);
                }
            } else {
                count = 0;
            }

        }


        System.out.println(str);
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}

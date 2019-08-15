package com.svetilnik.strings;

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

    //неправильно. нужно как с массивом символов
    public static void stringsAsArrayTask5(String s) {

        String str = s.replaceAll("\\s{2,}", " ").trim();

        System.out.println(str);
    }
}

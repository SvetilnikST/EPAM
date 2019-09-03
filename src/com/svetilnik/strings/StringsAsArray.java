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

//    public static void stringsAsArrayTask2() {
////        String str = "Starts word replace word word.";
////        String forReplace = "word";
////        String replacementValue = "letter";
////        System.out.println(str);
////        System.out.println(str.replace(forReplace, replacementValue));
//
////        String[] strings = new String[]{"Start", "word", "replace", "word", "word"};
////        String forReplace = "word";
////        String replacementValue = "letter";
////        for (int i = 0; i < strings.length; i++) {
////            if (strings[i] == forReplace) {
////                strings[i] = replacementValue;
////
////            }
////        }
////
////        for (int i = 0; i < strings.length; i++) {
////            System.out.print(strings[i] + " ");
////        }
//
//        String string = "String word word jkl word";
//
//        System.out.println(string.contains("word"));
//
////        char[] chars = {'w', 'o', 'r', 'd'};
////        char[] latter = {'l', 'a', 't', 't', 'e', 'r'};
//        char[] charsString = string.toCharArray();
//        for (char c : charsString) {
//            System.out.print(c);
//        }
//
//    }

//    public static void stringsAsArrayTask2(String string, String wordS, String replace) {
//        char[] chars = string.toCharArray();
//        char[] word = wordS.toCharArray();
//        char[] letter = replace.toCharArray();
//
//        int count = 0;
//        int k = 0;
//        int z = 0;
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == word[k]) {
//                for (int j = 0; j < word.length; j++) {
//                    if (chars[i + j] == word[j]) {
//                        z++;
//                    }
//                    if (z == word.length) {
//                        z = 0;
//                        count++;
//                    }
//                }
//
//            }
//        }
//
//        //вот тут рабоать с массивом
//        int lengh = chars.length + ((letter.length - word.length) * count);
//
//
//        char[] mass = new char[lengh];
////        count = 0;
//        z = 0;
//
//        for (int p = 0; p < mass.length; ) {
//
//            for (int i = 0; i < chars.length; i++) {
//
//                if (chars[i] == word[k]) {
//                    for (int j = 0; j < word.length; j++) {
//
//                        if (chars[i + j] == word[j] && i + j < chars.length) {
//                            z++;
//                        }
//
//                        if (z == word.length) {
//                            for (int l = 0; l < letter.length; l++) {
//                                if (p + l < mass.length - 1) {
//                                    mass[p + l] = letter[l];
//                                    z = 0;
//                                }
//                            }
//                            p = p + letter.length;
//                            i = i + word.length - 1;
////                            count++;
//                        }
//                    }
//
//                } else {
//                    mass[p] = chars[i];
//                    p++;
//                }
//
//            }
//        }
//
//
//        for (int i = 0; i < chars.length; i++) {
//            System.out.print(chars[i]);
//        }
//        System.out.println();
//
//        for (int i = 0; i < mass.length; i++) {
//            System.out.print(mass[i]);
//        }
//
//    }


    public static void stringsAsArrayTask2(String string, String wordS, String replace) {
        char[] chars = string.toCharArray();
        char[] word = wordS.toCharArray();
        char[] letter = replace.toCharArray();

        int count = 0;
        int k = 0;
        int z = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == word[k] && i != chars.length - 1) {

                for (int j = 0; j < word.length; j++) {
                    if (i + j < chars.length - 1) {
                        if (chars[i + j] == word[j]) {
                            z++;
                            if (z == word.length) {
                                count++;
                                z = 0;
                            } else continue;
                        } else {
                            z = 0;
                            continue;
                        }
                    }
                }
            }
        }

        //вот тут рабоать с массивом
        int lengh = chars.length + ((letter.length - word.length) * count);
        char[] mass = new char[lengh];

        for (int p = 0; p < mass.length; ) {

            for (int i = 0; i < chars.length; i++) {

                if (chars[i] == word[k] && i != chars.length - 1) {
                    for (int j = 0; j < word.length; j++) {

                        if (i + j < chars.length - 1) {
                            if (chars[i + j] == word[j]) {
                                z++;

                                if (z == word.length) {
                                    for (int l = 0; l < letter.length; l++) {
                                        if (p + l < mass.length - 1) {
                                            mass[p + l] = letter[l];
                                            z = 0;
                                        }
                                    }
                                    p = p + letter.length;
                                    i = i + word.length - 1;
                                } else continue;
                            } else continue;
                        }
                    }
                } else {
                    if (p < mass.length) {
                        mass[p] = chars[i];
                        p++;
                    } else break;
                }
            }
        }


        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
        }

    }

    public static void stringsAsArrayTask3() {
        String[] str = new String[]{"1235648 dvfvdf1245 dlls"};
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

    public static void stringsAsArrayTask4(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int k = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '1' && chars[i] <= '9') {
                k = 1;
            } else {
                if (k == 1) {
                    count++;
                    k = 0;
                }
            }
        }
        System.out.println("Count numbers = " + count);
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


}

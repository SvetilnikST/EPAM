package com.svetilnik.strings;

/**
 * Работа со строкой как с массивом символов
 */
public class StringsAsArray {

    public static void stringsAsArrayTask1(String[] camelCase) {

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

    public static void stringsAsArrayTask2(String string, String replaceableWord, String wordToReplace) {
        char[] chars = string.toCharArray();
        char[] word = replaceableWord.toCharArray();
        char[] letter = wordToReplace.toCharArray();
        char[] mass;
        int lengh;
        int count;

        count = countRepeat(chars, word);
        lengh = lengthArray(chars, word, letter, count);
        mass = new char[lengh];

        String result = replaceWord(chars, word, letter, mass);

        System.out.println("Last string: "+string);
        System.out.println("New  string: "+result);
    }

    private static int countRepeat(char[] chars, char[] word) {

        int z = 0;
        int count = 0;

        for (int i = 0; i < chars.length; ) {

            if (chars[i] == word[0] && i+word.length< chars.length) {

                for (int j = 0; j < word.length; j++) {

                    if (chars[i + j] == word[j] && i + j < chars.length) {
                        z++;
                    }
                }

                if (z == word.length) {
                    z = 0;
                    count++;
                    i = i + word.length;
                } else {
                    i++;
                    z = 0;
                }
            } else {
                i++;
            }
        }
        return count;
    }

    private static String replaceWord(char[] chars, char[] word, char[] letter, char[] mass) {

        int z = 0;

        for (int p = 0; p < mass.length; ) {
            for (int i = 0; i < chars.length; ) {

                if (chars[i] == word[0] && i+word.length<chars.length) {

                    for (int j = 0; j < word.length; j++) {

                        if (chars[i + j] == word[j] && i + j < chars.length) {
                            z++;
                        }
                    }

                    if (z == word.length) {
                        z = 0;

                        for (int l = 0; l < letter.length; l++) {
                            mass[p + l] = letter[l];
                        }
                        p = p + letter.length;
                        i = i + word.length;
                    } else {

                        if (p < mass.length) {
                            mass[p] = chars[i];
                            p++;
                            i++;
                            z = 0;
                        }
                    }
                } else {
                    if (p < mass.length) {
                        mass[p] = chars[i];
                        p++;
                        i++;
                    }
                }
            }
        }

        String resalt = new String(mass);
        return resalt;
    }

    private static int lengthArray(char[] chars, char[] word, char[] letter, int count) {
        int length;
        return length = chars.length + (letter.length - word.length) * count;
    }

    public static void stringsAsArrayTask3(String[] str) {

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

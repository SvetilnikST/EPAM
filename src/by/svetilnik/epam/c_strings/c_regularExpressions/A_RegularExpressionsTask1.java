package by.svetilnik.epam.c_strings.c_regularExpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A_RegularExpressionsTask1 {

    private static final String text = new String("Регулярные выражения — задает шаблон для строк.\nЕсли у программиста стоит задача. Обработать большой набор строк. Отыскать в нем нужную или проверить соответствует ли входящая строка определенному правилу.\nРегулярные выражения появляются очень к стати.");
    private static final String text2 = new String("av aaav aaaaa gh ewa. zoka more. Not aaate");
    private static final String endOfSentence = "[.!?]";
    private static final String space = "\\s";


    public static void task1() {
        task1SortParagraf(text);
        task1SortSentence(text);
        task1SortWords(text2, "a");
    }

    private static void task1SortWords(String text2, String a) {
        Pattern pattern = Pattern.compile(endOfSentence);
        Pattern patternWord = Pattern.compile(space);
        String[] sentenses = pattern.split(text2);

        String pat = a;

        Pattern patternA = Pattern.compile(pat);

        for (int k = 0; k < sentenses.length; k++) {
            String[] words = patternWord.split(sentenses[k]);

            //найти количество раз сколько встречается символ этот.
            sentenses[k] = sortWord(words, patternA);
        }
        printArrayString(sentenses);

    }

    private static void task1SortSentence(String text) {
        Pattern pattern = Pattern.compile(endOfSentence);
        Pattern patternWord = Pattern.compile(space);

        String[] sentenses = pattern.split(text);

        for (int k = 0; k < sentenses.length; k++) {
            String[] words = patternWord.split(sentenses[k]);
            sentenses[k] = sort(words);
        }
        printArrayString(sentenses);
    }

    public static String sort(String[] words) {
        String str = "";
        for (int i = words.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }

        }

        for (String word : words) {
            str = str + word + " ";
        }
        return str;
    }

    public static String sortWord(String[] words, Pattern pattern) {
        String str = "";
        Matcher matcher;

        int[] rez = new int[words.length];
        int count = 0;
        int countNull = 0;
        //считаем сколько раз а встречается в слове
        for (int i = 0; i < words.length; i++) {
            matcher = pattern.matcher(words[i]);
            while (matcher.find()) {
                count++;
            }
            rez[i] = count;
            count = 0;
        }

        for (int aRez : rez) {
            if (aRez == 0) {
                countNull++;
            }
        }

        if (countNull == rez.length) {
            //сотриторка по алфавиту
            Arrays.sort(words);
        } else {
            sortArray(rez, words);
        }

        for (String word : words) {
            str = str + word + " ";
        }
        return str;
    }


    private static void task1SortParagraf(String text) {

        Pattern pattern = Pattern.compile(endOfSentence);
        Matcher matcher;

        int countSentense = 0;
        int countParagraf = 0;

        //считаем количество абзацев
        for (String retval : text.split("\n")) {
            countParagraf++;
            System.out.println(retval);
        }

        //заполняем массив строк значениями
        String[] strings = new String[countParagraf];
        for (int i = 0; i < strings.length; ) {
            for (String retval : text.split("\n")) {
                strings[i] = retval;
                i++;
            }
        }

        int[] mass = new int[countParagraf];

        //тут считаем сколько предложений. сколько раз встречается .!? и заполняем новый массив Int
        for (int i = 0; i < strings.length; i++) {
            matcher = pattern.matcher(strings[i]);
            while (matcher.find()) {
                countSentense++;
                mass[i] = countSentense;
            }
            countSentense = 0;
        }

        sortArray(mass, strings);

        System.out.println();

        for (String ind : strings) {
            System.out.println(ind);
        }
    }

    public static void sortArray(int[] mass, String[] strings) {
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;

                    String t = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = t;
                }
            }
        }
    }


    public static void printArrayString(String[] strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }

}

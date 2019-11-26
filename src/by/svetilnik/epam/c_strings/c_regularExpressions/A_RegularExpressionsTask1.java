package by.svetilnik.epam.c_strings.c_regularExpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A_RegularExpressionsTask1 {

    //    private static final String text = new String("Добро Аня.\nпожаловать тебе! К нам? ух.\nдавно пора на.\nProg Lang?");
    private static final String text = new String("Регулярные выражения — задает шаблон для строк. Если у программиста стоит задача обработать большой набор строк. Отыскать в нем нужную или проверить соответствует ли входящая строка определенному правилу. Регулярные выражения появляются очень к стати.");
    private static final String ENDOFSENTENSE = "[.!?]";

    private static final String ENDOFWORD = "a-z";
    private static final String SYMBOL = "\\s";

    public static void task1() {
//        task1SortParagraf(text);
        task1SortSentence(text);


    }

    private static void task1SortSentence(String text) {
        //разбили текст на предложения и поместили в массив
        Pattern pattern = Pattern.compile(ENDOFSENTENSE);
        String[] sentenses = pattern.split(text);

        Pattern patternWord = Pattern.compile(SYMBOL);

        // сортировать в предложении слова по длинне
        for (int k = 0; k < sentenses.length; k++) {
            //вот тут нужно разбить на массив в котором будем хранить слова
            String[] words = patternWord.split(sentenses[k]);


//            for (int i = words.length - 1; i > 0; i--) {
//                for (int j = 0; j < i; j++) {
//                    if (words[j].length() > words[j + 1].length()) {
//                        String tmp = words[j];
//                        words[j] = words[j + 1];
//                        words[j + 1] = tmp;
//                    }
//                }
//            }

            String s = sort(words).toString();
//            sentenses[k] = s;
            int b = 0;
        }


        System.out.print(Arrays.toString(sentenses));
        int a = 0;
//        System.out.print(Arrays.toString(sentenses));
    }

    public static String[] sort(String[] words) {
        for (int i = words.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }
        return words;
    }


    private static void task1SortParagraf(String text) {

        Pattern pattern = Pattern.compile(ENDOFSENTENSE);
        Matcher matcher;

        int countSentense = 0;
        int countParagraf = 0;

        //считаем количество абзацев
        for (String retval : text.split("\n")) {
            countParagraf++;
            System.out.println(countParagraf + " " + retval);
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


    private static void task2() {

    }

    public static void sortArray2(int[] mass, String[] strings) {
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


}

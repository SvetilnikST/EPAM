package com.svetilnik.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsTask1 {

    private static final String text = new String("Добро.\nпожаловать! Ya? on.\nна\nProgLang?");

    private static final String xml = new String("<notes><note id =\"1\"><to>Вася</to><from>Света</from><heading>Напоминание</heading><body>Позвони мне завтра!</body></note><note id =\"2\"><to>Петя</to><from>Маша</from><heading>Важное напоминание</heading><body/></note></notes>");

    private static final String ENDOFSENTENSE = "[.!?]";    //знак препинания


//    <notes>.+<\/notes>  внутри

    public static void start() {
//        task1SortParagraf(text);
        task2SortSentense();
    }

    private static void task2SortSentense() {

        Pattern regexp = Pattern.compile("(</?[a-z]*>)");

        Matcher matcher = regexp.matcher(xml);

//        while (matcher.find()) {
//            System.out.println(matcher.group() + matcher.start()+matcher.end());
//        }
        while (matcher.find()) {
            System.out.println(matcher.group());
//            for (int i = 1; i <= matcher.groupCount(); i++) {
//                System.out.println(matcher.start() + "    " + matcher.end());
//            }


        }
    }

    static void task1SortParagraf(String text) {

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

        //сортируем массив строк
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

        System.out.println();

        for (String ind : strings) {
            System.out.println(ind);
        }
    }
}

package by.svetilnik.epam.c_strings.c_regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A_RegularExpressionsTask1 {

    private static final String text = new String("Добро.\nпожаловать! Ya? on.\nна\nProgLang?");

    private static final String ENDOFSENTENSE = "[.!?]";

    public static void task1() {
//        task1SortParagraf(text);


    }


    private static void task2(){

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

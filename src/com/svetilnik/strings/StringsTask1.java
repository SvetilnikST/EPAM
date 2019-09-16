package com.svetilnik.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsTask1 {

    private static final String REGEX = "[.!?]";
    private static final String R = "^";
    private static final String INPUT = "1 Думаю, что с технической точки зрения все достаточно понятно." +
            "2 Но возникает логичный вопрос — зачем это вообще надо? С инкапсуляцией более-менее понятно, с наследованием — в принципе тоже." +
            "3 Но вот этот механизм зачем, какое преимущество мы получим при использовании этой парадигмы!" +
            "4 Для первого приближения! Рассмотрим наш пример графического приложения. В котором мы создавали свой компонент OvalComponent. ";

    public static void task1() {
        Pattern p = Pattern.compile(REGEX);
        Pattern p2 = Pattern.compile(R);

        Matcher m = p.matcher(INPUT);   // получение matcher объекта
        Matcher m2 = p2.matcher(INPUT); //начало строки
        int count = 0;
        int t = 0;

        if (m2.find()) {
            t++;
            while (m.find()) {
                count++;
//                System.out.println("Номер вхождения: " + count);
            }
            System.out.println("Кол-во предложений в " + t + " = " + count);
            count = 0;
        }


    }
}

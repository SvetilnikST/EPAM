package com.svetilnik.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsTask1 {

    private static final String REGEX = "\\bкот\\b";
    private static final String INPUT = "1 Думаю, что с технической точки зрения все достаточно понятно." +
            "2 Но возникает логичный вопрос — зачем это вообще надо? С инкапсуляцией более-менее понятно, с наследованием — в принципе тоже." +
            "3 Но вот этот механизм зачем, какое преимущество мы получим при использовании этой парадигмы?" +
            "4 Для первого приближения! Рассмотрим наш пример графического приложения. В котором мы создавали свой компонент OvalComponent. ";

    public static void task1(){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // получение matcher объекта
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Номер вхождения: "+count);
            System.out.println("Начальная позиция вхождения: "+m.start());
            System.out.println("Конечная позиция вхождения: "+m.end());
        }

    }
}

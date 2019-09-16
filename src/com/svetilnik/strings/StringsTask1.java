package com.svetilnik.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsTask1 {

    private static final String REGEX = "\\bкот\\b";
    private static final String INPUT = "кот кот кот котёл кот";

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

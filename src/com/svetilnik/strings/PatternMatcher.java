package com.svetilnik.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

    public static void Task2() {

        //строка где ищем
        String input = "Hello";
        //строка что ищем
        Pattern pattern = Pattern.compile("Hello");
        //передаем строку для поиска вхождений
        Matcher matcher = pattern.matcher(input);

        boolean found = matcher.matches();
        if (found) {
            System.out.println("Найдено");
        } else System.out.println("Не найдено");
    }
}

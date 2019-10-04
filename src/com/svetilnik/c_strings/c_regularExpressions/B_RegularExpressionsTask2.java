package com.svetilnik.c_strings.c_regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_RegularExpressionsTask2 {

    private static final String xml = new String("<notes><note id =\"1\"><to>Вася</to><from>Света</from><heading>Напоминание</heading><body>Позвони мне завтра!</body></note><note id =\"2\"><to>Петя</to><from>Маша</from><heading>Важное напоминание</heading><body/></note></notes>");

//    (<(.|\n)+?>.+){1,} находит содержимое групп
//    <notes>((<note\s><(.|/n)+?><\/note>){1,})<\/notes> находит группы

    public static void start() {
        task2SortSentense();
    }

    private static void task2SortSentense() {
        //проверка на соответствие строки шаблону
        Pattern pattern = Pattern.compile("(<(.|\\\\n)+?>.+</(.|\\\\n)+?>)");
        Matcher matcher = pattern.matcher(xml);
        boolean b  = matcher.matches();

        if(b ==true){
            System.out.println(b);
        }else {
            System.out.println("String not true");
        }

    }
}

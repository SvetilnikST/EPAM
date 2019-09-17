package com.svetilnik.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsTask1 {

    private static final String PARAGRAF = "[\n]"; //абзац
    private static final String ENDOFSENTENSE = "[.!?]";    //знак препинания
    private static final String INPUT = "" +
            "1. \n " +
            "2 Но? С.\n " +
            "3 1ы!\n " +
            "4 3я! наш. В.\n"
            ;

    public static void task1() {
        Pattern paragraf = Pattern.compile(PARAGRAF);//паттерн нахождения абзаца
        Pattern endOfSentence = Pattern.compile(ENDOFSENTENSE);

        Matcher m = paragraf.matcher(INPUT);   // получение matcher объекта Абзац
//        Matcher m2 = endOfSentence.matcher(INPUT); //знаки препинания

        int count = 0;
        int t = 0;

            while (m.find()) {
                count++;
                System.out.println("Номер вхождения: " + count);
                System.out.println(m.start());
                System.out.println(m.end());

                for (int i = m.start(); i < m.end(); i++) {

                }
                System.out.println(t);

            }
            t=0;
            count = 0;
        }
}

package by.svetilnik.epam.c_strings.c_regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_RegularExpressionsTask2 {

    private static final String xml = new String("<notes>\n" +
            "    <note id =\"1\">\n" +
            "        <to>Вася</to>\n" +
            "        <from>Света</from>\n" +
            "        <heading>Напоминание</heading>\n" +
            "        <body>Позвони мне завтра!</body>\n" +
            "    </note>\n" +
            "\n" +
            "    <note id =\"2\">\n" +
            "        <to>Петя</to>\n" +
            "        <from>Маша</from>\n" +
            "        <heading>Важное напоминание</heading>\n" +
            "        <body/>\n" +
            "    </note>\n" +
            "</notes>");


    public static void start() {
        task2SortSentense(xml);
    }

    private static void task2SortSentense(String xml) {
        String openTag = "(?<openTag><[^/].*?>)";
        String closeTag = "(?<closeTag><[/].*?>)";
        String body = "(?<open><[^/].*?>)(?<body>.*)(?<close><[/].*?>)";
        String singleTag = "(?<singleTag><.*?[/]>)";

        Pattern pattern = Pattern.compile(body + "|" + openTag + "|" + closeTag + "|" + singleTag);
        Matcher matcher = pattern.matcher(xml);

        //сделать проверку что строка в целом соответствует регулярке
        while (matcher.find()) {
            if (matcher.group("body") != null) {
                System.out.println("Open: " + matcher.group("open") +
                        "Body: " + matcher.group("body") +
                        "Close: " + matcher.group("close")
                );

            } else if (matcher.group("openTag") != null) {
                System.out.println("Open: " + matcher.group("openTag"));
            } else if (matcher.group("closeTag") != null) {
                System.out.println("Close: " + matcher.group("closeTag"));
            } else if (matcher.group("singleTag") != null) {
                System.out.println("Single: " + matcher.group("singleTag"));
            }
        }
    }
}

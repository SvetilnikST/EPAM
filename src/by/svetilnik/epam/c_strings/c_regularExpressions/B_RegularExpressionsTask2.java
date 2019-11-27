package by.svetilnik.epam.c_strings.c_regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_RegularExpressionsTask2 {

    private static final String xml = new String("<notes><note id =\"1\"><to>Вася</to><from>Света</from><heading>Напоминание</heading><body>Позвони мне завтра!</body></note><note id =\"2\"><to>Петя</to><from>Маша</from><heading>Важное напоминание</heading><body/></note></notes>");

    public static void start() {
        parserXML(xml);
    }

    private static void parserXML(String xml) {

        String openTag = "(?<openTag><[^/].*?>)";
        String closeTag = "(?<closeTag><[/].*?>)";
        String body = "(?<open><[^/].*?>)(?<body>.*)(?<close><[/].*?>)";
        String singleTag = "(?<singleTag><.*?[/]>)";

        Pattern allString = Pattern.compile("<[^/].*?>(<[^/].*?>(<[^/].*?>.*<[/].*?>){1,}<[/].*?>){1}<[/].*?>$");
        Pattern pattern = Pattern.compile(body + "|" + openTag + "|" + closeTag + "|" + singleTag);
        Matcher matcher = pattern.matcher(xml);


        Matcher matcher1 = allString.matcher(xml);
        if (matcher1.matches()) {

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
        } else System.out.println("Could not parse this line");
    }
}

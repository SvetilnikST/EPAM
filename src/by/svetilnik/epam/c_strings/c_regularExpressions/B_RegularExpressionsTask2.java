package by.svetilnik.epam.c_strings.c_regularExpressions;

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
        Pattern pNotes = Pattern.compile("<notes>(<note(.){1,}>.+</note>){1,}</notes>{1}");
        Matcher matcher = pNotes.matcher(xml);


        Pattern pOpenTeg = Pattern.compile("<[a-z]+?>");
        Matcher matcheOpenTeg = pOpenTeg.matcher(xml);
        Pattern pCloseTeg = Pattern.compile("<\\/[a-z]+?>");
        Matcher matcheCloseTeg = pCloseTeg.matcher(xml);
        int start = 0;
        int end = 0;
        boolean b = matcher.matches();

        if (b == true) {
//            System.out.println(b);

//            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < xml.length(); i++) {
                //открывающий тег
                if (matcheOpenTeg.find()) {
                    System.out.println("Открывающий тег:");
                    System.out.println(matcheOpenTeg.group());
                    if (start < matcheOpenTeg.end()) {
                        start = matcheOpenTeg.end();
                    }

                    //закрывающий тег
                    if (matcheCloseTeg.find()) {
                        System.out.println("Закрывающий тег:");
                        System.out.println(matcheCloseTeg.group());
//                        stringBuilder.append(matcheCloseTeg.group());

                        if (end < matcheCloseTeg.start()) {
                            end = matcheCloseTeg.start();
                        }
                    }


                }

//                System.out.print("Содержимое тега");
                //содержимое тега
                for (int j = start; j < end; j++) {

                    System.out.print(xml.charAt(j));
                }

//                stringBuilder.append(xml.charAt(i));
            }


//            System.out.println(stringBuilder);


        }
    }
}

package by.svetilnik.epam.e_BasicsOfOOP;

import by.svetilnik.epam.e_BasicsOfOOP.task1.Directory;
import by.svetilnik.epam.e_BasicsOfOOP.task1.TextFile;

import static by.svetilnik.epam.e_BasicsOfOOP.task1.FileLogic.*;

public class StartBasics {
    public static void task1() {
        TextFile textFile = new TextFile("first", new Directory("C://SomeDir"), "New File");

        printBody(textFile);

        renameFile(textFile, "second");

        addBodyToFile(textFile, " new String");
        printBody(textFile);

        deleteBody(textFile);
        printBody(textFile);
    }
}

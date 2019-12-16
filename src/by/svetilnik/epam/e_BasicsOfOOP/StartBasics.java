package by.svetilnik.epam.e_BasicsOfOOP;

import by.svetilnik.epam.e_BasicsOfOOP.task1.Directory;
import by.svetilnik.epam.e_BasicsOfOOP.task1.TextFile;
import by.svetilnik.epam.e_BasicsOfOOP.task1.file.File;

import static by.svetilnik.epam.e_BasicsOfOOP.task1.file.FileLogic.*;
import static java.nio.file.Files.createFile;

public class StartBasics {
    public static void task1() {
        TextFile textFile = new TextFile("first", new Directory("C://SomeDir"), "horray", ".txt");

        printBody(textFile);

        //преименовали файл
        System.out.println(textFile.getNameFile());
        renameFile(textFile, "second");
        System.out.println(textFile.getNameFile());


        addBodyToFile(textFile, " new String");
        printBody(textFile);
        deleteBody(textFile);
        printBody(textFile);
    }
}

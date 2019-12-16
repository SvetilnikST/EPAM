package by.svetilnik.epam.e_BasicsOfOOP.task1;

import by.svetilnik.epam.e_BasicsOfOOP.task1.file.File;

public class TextFile extends File {

    private String typeFile;

    public TextFile(String nameFile, Directory directory, String body, String typeFile) {
        super(nameFile, directory, body);
        this.typeFile = typeFile;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }
}

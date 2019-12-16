package by.svetilnik.epam.e_BasicsOfOOP.task1.file;

import by.svetilnik.epam.e_BasicsOfOOP.task1.Directory;

public class File {
    private String nameFile;
    private Directory directory;
    private String body;

    public File(String nameFile, Directory directory, String body) {
        this.nameFile = nameFile;
        this.directory = directory;
        this.body = body;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

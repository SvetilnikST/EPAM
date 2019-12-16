package by.svetilnik.epam.e_BasicsOfOOP.task1;

import by.svetilnik.epam.e_BasicsOfOOP.task1.Directory;

public class File {
    private String nameFile;
    private Directory directory;

    public File(String nameFile, Directory directory) {
        this.nameFile = nameFile;
        this.directory = directory;
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
}

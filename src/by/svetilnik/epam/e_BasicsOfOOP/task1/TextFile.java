package by.svetilnik.epam.e_BasicsOfOOP.task1;

public class TextFile extends File {

    private static final String typeFile = ".txt";
    private String body;

    public TextFile(String nameFile, Directory directory, String body) {
        super(nameFile + typeFile, directory);
        this.body = body;
    }

    public static String getTypeFile() {
        return typeFile;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void setNameFile(String nameFile) {
        super.setNameFile(nameFile + typeFile);
    }
}

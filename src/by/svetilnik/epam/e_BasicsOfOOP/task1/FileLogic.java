package by.svetilnik.epam.e_BasicsOfOOP.task1;

public class FileLogic {

    public static void renameFile(TextFile file, String nameFile) {
        file.setNameFile(nameFile);
    }

    public static void printBody(TextFile file) {
        System.out.println("File name:" + " " + file.getNameFile());
        System.out.println("Body:" + " " + file.getBody());
        System.out.println();
    }

    public static File addBodyToFile(TextFile file, String addString) {
        file.setBody(file.getBody() + addString);
        return file;
    }

    //удалить содержимое
    public static void deleteBody(TextFile file) {
        file.setBody(null);
    }
}

package by.svetilnik.epam.e_BasicsOfOOP.task1.file;

import by.svetilnik.epam.e_BasicsOfOOP.task1.Directory;

public class FileLogic {

    //переименовать файл
    public static void renameFile(File file, String nameFile) {
        file.setNameFile(nameFile);
    }

    //вывести на консоль содержимое
    public static void printBody(File file) {
        System.out.println(file.getBody());
    }

    //дополнить файл
    public static File addBodyToFile(File file, String addString) {

        file.setBody(file.getBody() + addString);

        return file;
    }

    //удалить содержимое
    public static void deleteBody(File file) {
        file.setBody(null);
    }


}

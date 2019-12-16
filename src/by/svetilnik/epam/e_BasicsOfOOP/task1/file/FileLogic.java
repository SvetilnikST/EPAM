package by.svetilnik.epam.e_BasicsOfOOP.task1.file;

import by.svetilnik.epam.e_BasicsOfOOP.task1.Directory;

public class FileLogic {

    //создать файл
    public void createFile(String nameFile, Directory directory, String body) {
        File file = new File(nameFile, directory, body);
    }

    //переименовать файл
    public void renameFile(File file, String nameFile) {
        file.setNameFile(nameFile);
    }

    //вывести на консоль содержимое
    public static void printBody(File file){
        System.out.println(file.getBody());
    }

    //дополнить файл
    private static void editFileBody(){

    }

    //удалить

}

package by.svetilnik.epam.d_classes.simpleClasses.task9;

import java.util.ArrayList;

public class BookLogic {

    public static void fillBooks(ArrayList<Book> books){

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(0,new Author(1,"Mark","Tven"));
        authors.add(1,new Author(2,"Jeck","London"));

        PublishingHouse redHouse = new PublishingHouse(1,"House1");
        Binding hard = new Binding(1,"hard");

        books.add(0, new Book(1,"King",authors,redHouse,2000,250,150.5,hard));
    }
}

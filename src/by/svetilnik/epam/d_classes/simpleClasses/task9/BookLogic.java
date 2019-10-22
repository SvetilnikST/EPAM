package by.svetilnik.epam.d_classes.simpleClasses.task9;

import java.util.ArrayList;

public class BookLogic {

    public static BooksList fillBooks(){

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Author> authorsOne = new ArrayList<>();
        authorsOne.add(0,new Author(1,"Mark","Tven"));
        authorsOne.add(1,new Author(2,"Jeck","London"));

        ArrayList<Author> authorsTwo = new ArrayList<>();
        authorsOne.add(0,new Author(3,"Mel","Ivan"));


        PublishingHouse redHouse = new PublishingHouse(1,"House1");
        Binding hard = new Binding(1,"hard");

        books.add(0, new Book(1,"King",authorsOne,redHouse,2000,250,150.5,hard));
        books.add(1, new Book(2,"King",authorsTwo,redHouse,2012,100,100.0,hard));
        BooksList booksList = new BooksList();
        booksList.setBooks(books);
        return booksList;
    }





}

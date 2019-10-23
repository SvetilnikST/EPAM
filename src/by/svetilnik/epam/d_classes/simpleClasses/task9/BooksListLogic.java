package by.svetilnik.epam.d_classes.simpleClasses.task9;

import by.svetilnik.epam.d_classes.simpleClasses.task9.logic.*;

import java.util.ArrayList;

public class BooksListLogic {

    public static void fillBooks(BooksList booksList) {

        ArrayList<Author> authorsOne = new ArrayList<>();
        authorsOne.add( new Author(1, "Mark", "Tven"));
        authorsOne.add( new Author(2, "Jeck", "London"));

        ArrayList<Author> authorsTwo = new ArrayList<>();
        authorsTwo.add( new Author(3, "Mel", "Ivan"));
        authorsTwo.add( new Author(4, "New", "Ivan"));

        PublishingHouse redHouse = new PublishingHouse(1, "House1");
        Binding hard = new Binding(1, "hard");

        ArrayList<Book> books = new ArrayList<>();
        books.add( new Book(1, "King", authorsOne, redHouse, 2000, 250, 150.5, hard));
        books.add(new Book(2, "Leon", authorsTwo, redHouse, 2012, 100, 100.0, hard));
        booksList.setBooks(books);
    }

    public static BooksList findBookForAuthor(BooksList booksList, Author author) {

        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < booksList.getBooks().size(); i++) {
            for (int j = 0; j < booksList.getBooks().get(i).getAuthors().size(); j++) {
                if (booksList.getBooks().get(i).getAuthors().get(j).getId() == author.getId()) {
                    books.add(booksList.getBooks().get(i));
                }
            }
        }
        booksList.setBooks(books);

        return booksList;
    }


    public static BooksList findBookForPublishing(BooksList booksList, PublishingHouse publishingHouse) {

        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < booksList.getBooks().size(); i++) {
            if (booksList.getBooks().get(i).getPublishingHouse().getId() == publishingHouse.getId()) {
                books.add(booksList.getBooks().get(i));
            }
        }
        booksList.setBooks(books);

        return booksList;
    }


    public static BooksList printBookAfterYear(BooksList booksList, int yeas) {

        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < booksList.getBooks().size(); i++) {
            if (booksList.getBooks().get(i).getYearOfPublishing() > yeas) {
                books.add(booksList.getBooks().get(i));
            }
        }
        booksList.setBooks(books);
        return booksList;
    }
}

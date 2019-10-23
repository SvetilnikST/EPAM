package by.svetilnik.epam.d_classes.simpleClasses.task9;

import by.svetilnik.epam.d_classes.simpleClasses.task9.logic.BooksList;

public class BooksListView {

    public static void printBooksList(BooksList booksList) {

        for (int i = 0; i < booksList.getBooks().size(); i++) {
            System.out.println(booksList.getBooks().get(i).toString());
        }
    }
}

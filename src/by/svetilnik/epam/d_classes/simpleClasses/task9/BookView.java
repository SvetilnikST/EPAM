package by.svetilnik.epam.d_classes.simpleClasses.task9;

public class BookView {

    public static void printBooksList(BooksList booksList) {

        for (int i = 0; i < booksList.getBooks().size(); i++) {
            System.out.println(booksList.getBooks().get(i).toString());
        }
    }


    public static void printBookForAuthor(BooksList booksList, Author author) {
        for (int i = 0; i < booksList.getBooks().size(); i++) {
            for (int j = 0; j < booksList.getBooks().get(i).getAuthors().size(); j++) {
                if (booksList.getBooks().get(i).getAuthors().get(j).getId() == author.getId()) {
                    System.out.println(booksList.getBooks().get(i).toString());
                }
            }
        }
    }

    public static void printBookForPublishing(BooksList booksList, PublishingHouse publishingHouse) {
        for (int i = 0; i < booksList.getBooks().size(); i++) {
            if (booksList.getBooks().get(i).getPublishingHouse().getId() == publishingHouse.getId()) {
                System.out.println(booksList.getBooks().get(i).toString());
            }
        }
    }


    public static void printBookAfterYear(BooksList booksList, int yeas) {

        for (int i = 0; i < booksList.getBooks().size(); i++) {
            if (booksList.getBooks().get(i).getYearOfPublishing() > yeas) {
                System.out.println(booksList.getBooks().get(i).toString());
            }
        }
    }
}

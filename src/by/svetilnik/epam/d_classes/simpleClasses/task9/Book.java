package by.svetilnik.epam.d_classes.simpleClasses.task9;

import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private ArrayList<Author> authors;
    private PublishingHouse publishingHouse;
    private int yearOfPublishing;
    private int countPage;
    private double price;
    private Binding bookBinding;


    public Book(int id, String name, ArrayList<Author> authors, PublishingHouse publishingHouse, int yearOfPublishing, int countPage, double price, Binding bookBinding) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.countPage = countPage;
        this.price = price;
        this.bookBinding = bookBinding;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(PublishingHouse publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Binding getBookBinding() {
        return bookBinding;
    }

    public void setBookBinding(Binding bookBinding) {
        this.bookBinding = bookBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + authors +
                ", publishingHouse=" + publishingHouse +
                ", yearOfPublishing=" + yearOfPublishing +
                ", countPage=" + countPage +
                ", price=" + price +
                ", bookBinding=" + bookBinding +
                '}';
    }
}

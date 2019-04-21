package library.model;

import library.io.DataReader;
import library.model.Book;

public class Library {

    private final String appName = "Biblioteka v0.1";

    private final int MAX_BOOKS = 1;
    private Book[] books = new Book[MAX_BOOKS];
    private int booksNumber;

    public void addBook(Book book) {
        books[booksNumber] = book;
        booksNumber++;
    }

    public String getAppName() {
        return appName;
    }

    public int getMAX_BOOKS() {
        return MAX_BOOKS;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getBooksNumber() {
        return booksNumber;
    }
}

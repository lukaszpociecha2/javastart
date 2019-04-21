package library.model;

import library.io.DataReader;
import library.model.Book;

public class Library {

    private static final String appName = "Biblioteka v0.1";

    private static final int MAX_BOOKS = 1;
    private Book[] books = new Book[MAX_BOOKS];
    private int booksNumber;

    private static final int MAX_MAGAZINES = 1;
    private Magazine[] magazines = new Magazine[MAX_MAGAZINES];
    private int magazinesNumber;

    public String getAppName() {
        return appName;
    }

    // books

    public void addBook(Book book) {
        books[booksNumber] = book;
        booksNumber++;

    }


    public static int getMAX_BOOKS() {
        return MAX_BOOKS;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getBooksNumber() {
        return booksNumber;
    }

    // magazines

    public void addMagazine(Magazine magazine) {
        magazines[magazinesNumber]=magazine;
        magazinesNumber++;
    }

    public int getMaxMagazines() {
        return MAX_MAGAZINES;
    }

    public Magazine[] getMagazines() {
        return magazines;
    }

    public int getMagazinesNumber() {
        return magazinesNumber;
    }
}
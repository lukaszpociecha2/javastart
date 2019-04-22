package library.model;

import java.util.Objects;

public class Book extends Publication {

    private String author;
    private int pages;
    private String isbn;


    public Book(String title, String author, int year, int pages, String publisher, String isbn) {
        super(title, year, publisher);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }


    @Override
    public String toString() {
        return super.toString() + ", author: " + author + ", pages: " + pages + ", ISBN: " + isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return getPages() == book.getPages() &&
                Objects.equals(getAuthor(), book.getAuthor()) &&
                Objects.equals(getIsbn(), book.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAuthor(), getPages(), getIsbn());
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

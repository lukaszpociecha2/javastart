package library.model;

public class Book extends Publication {

    private String author;
    private int pages;
    private String isbn;


    public Book(String title, String author, int year, int pages, String publisher, String isbn) {
        setTitle(title);
        setPublisher(publisher);
        setYear(year);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = info = getTitle() + "; " + author + "; " + getYear() + "; "
                + pages + "; " + getPublisher() + isbn;

        System.out.println(info);
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

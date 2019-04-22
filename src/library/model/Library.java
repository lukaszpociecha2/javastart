package library.model;

public class Library {

    private static final String appName = "Biblioteka v0.1";

    private static final int MAX_PUBLICATIONS = 2;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];
    private int publicationsNumber;


    public String getAppName() {
        return appName;
    }

    public static int getMaxPublications() {
        return MAX_PUBLICATIONS;
    }

    public Publication[] getPublications() {
        return publications;
    }

    public int getPublicationsNumber() {
        return publicationsNumber;
    }

    // books

    public void addBook(Book book) {
        publications[publicationsNumber] = book;
        publicationsNumber++;

    }

    // magazines

    public void addMagazine(Magazine magazine) {
        publications[publicationsNumber]=magazine;
        publicationsNumber++;
    }


}
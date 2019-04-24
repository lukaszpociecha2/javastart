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
        Publication[] result = new Publication[publicationsNumber];
        for (int i = 0; i <publicationsNumber ; i++) {
            result[i]=publications[i];
        }

        return result;
    }

    public int getPublicationsNumber() {
        return publicationsNumber;
    }


    public void addPublication(Publication publication) throws ArrayIndexOutOfBoundsException {
        if(publicationsNumber>=MAX_PUBLICATIONS){
            throw new ArrayIndexOutOfBoundsException("Brak miejsca w bibliotece. Pojemność biblioteki: " + MAX_PUBLICATIONS);
        } else {
            publications[publicationsNumber]=publication;
            publicationsNumber++;
        }
    }

    /*// books

    public void addBook(Book book) {
        publications[publicationsNumber] = book;
        publicationsNumber++;

    }

    // magazines

    public void addMagazine(Magazine magazine) {
        publications[publicationsNumber]=magazine;
        publicationsNumber++;
    }*/
}
package library.model;

import java.util.Arrays;

public class Library {

    private static final String appName = "Biblioteka v0.1";

    private static final int INITIAL_SIZE = 1;
    private Publication[] publications = new Publication[INITIAL_SIZE];
    private int publicationsNumber = 0;

    public String getAppName() {
        return appName;
    }

    public static int getInitialSize() {
        return INITIAL_SIZE;
    }

    public Publication[] getPublications() {
        Publication[] result = new Publication[publicationsNumber];
        for (int i = 0; i < publicationsNumber; i++) {
            result[i] = publications[i];
        }

        return result;
    }

    public int getPublicationsNumber() {
        return publicationsNumber;
    }


    public void addPublication(Publication publication) {
        if (publicationsNumber >= INITIAL_SIZE) {
            // throw new ArrayIndexOutOfBoundsException("Brak miejsca w bibliotece. Pojemność biblioteki: " + INITIAL_SIZE);
            // w związku z automatycznym rozszerzaniem Publication[] nie wystąpi blad ArrayIndexOutOfBounds
            publications = Arrays.copyOf(publications, publications.length * 2);

        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }

    public boolean removePublication(Publication publication) {
        boolean result = true;
        if (publication == null) return false;

        int publicationIndex = -1;

        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i].equals(publication)) {
                publicationIndex = i;
            }
        }
        if (publicationIndex == -1) {
            return false;
        }

        if (publicationIndex != -1) {
            System.out.println("Index publikacji do usunięcia: " + publicationIndex);
            Publication[] tempPublications = new Publication[publicationsNumber-1];

            for (int i = 0; i < publicationIndex; i++) {
                System.out.println("W pierwszej pętli");
                tempPublications[i] = publications[i];
                System.out.println(tempPublications[i]);

            }
            for (int j = publicationIndex; j < publicationsNumber - 1; j++) {
                System.out.println("W drugiej pętli");
                tempPublications[j] = publications[j + 1];

                System.out.println(publications[j]);
            }

            publications = tempPublications; //Arrays.copyOf(tempPublications, tempPublications.length);
            publicationsNumber--;

        }
        return result;
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
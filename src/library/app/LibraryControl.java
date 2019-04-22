package library.app;

import library.io.DataReader;
import library.model.Book;
import library.model.Library;
import library.model.Magazine;
import library.model.Publication;


public class LibraryControl {

    // OPTIONS

    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int PRINT_BOOKS = 2;
    private static final int ADD_MAGAZINE = 3;
    private static final int PRINT_MAGAZINES = 4;


    private Library library = new Library();
    private DataReader dataReader = new DataReader();

    public LibraryControl() {
        System.out.println("Witaj w bibliotece.");
    }

    public void controlLoop() {

        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case EXIT:
                    System.out.println("Koniec programu");
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks(library);
                    break;
                case ADD_MAGAZINE:
                    addMagazines();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");

            }
        } while (option != EXIT);

        dataReader.close();
    }

    private void printOptions() {

        System.out.println("Wybierz opcję: ");
        System.out.println(EXIT + " - wyjście z programu");
        System.out.println(ADD_BOOK + " - dodanie nowej książki");
        System.out.println(PRINT_BOOKS + " - wyświetl dostępne książki");
        System.out.println(ADD_MAGAZINE + " - dodanie nowego magazynu");
        System.out.println(PRINT_MAGAZINES + " - wyświetl dostępne magazyny");
        System.out.println("---------------");
    }

    //add book + print books
    private void addBook() {
        if (library.getPublicationsNumber() == Library.getMaxPublications()) {
            System.out.println("Brak miejsca");
        } else {
            Book newBook = dataReader.readAndCreateBook();
            library.addBook(newBook);
        }

    }

    public void printBooks(Library library) {
        int booksCount = 0;
        if (library.getPublicationsNumber() == 0) {
            System.out.println("W bibliotece nie ma ksiązek.");
        } else {
            for (int i = 0; i < library.getPublicationsNumber(); i++) {
                if (library.getPublications()[i] instanceof Book) {
                    System.out.println(library.getPublications()[i].toString());
                    System.out.println("--------------------------");
                    booksCount++;
                } else System.out.println("Ilość książek w bibliotece: 0");
            }
        }
    }

    // add magazine + print magazines
    public void addMagazines() {
        if (library.getPublicationsNumber() == library.getMaxPublications()) {
            System.out.println("Maksymalna liczba magazynów osiągnięta.");
        } else {
            library.addMagazine(dataReader.readAndCreateMagazine());
        }
    }

    public void printMagazines() {
        int countMagazines = 0;
        if (library.getPublicationsNumber() == 0) {
            System.out.println("W bibliotece nie ma magazynów");
        } else {
            for (Publication publication : library.getPublications()) {
                if (publication instanceof Magazine) {
                    System.out.println(publication.toString());
                    System.out.println("--------------------------");
                    countMagazines++;
                } else System.out.println("Ilość magazynów w bibliotece: 0");
            }
        }
    }


    public void printInfo() {
        System.out.println("System może przechowywać do " + Library.getMaxPublications() + " książek");
    }


}

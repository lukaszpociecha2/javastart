package library.app;

import library.io.DataReader;
import library.model.Book;
import library.model.Library;

public class LibraryControl {

    // OPTIONS

    private final int EXIT = 0;
    private final int ADD_BOOK = 1;
    private final int PRINT_BOOKS = 2;


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
                default:
                    System.out.println("Nie ma takiej opcji");

            }
        } while (option != EXIT);
    }

    private void printOptions() {

        System.out.println("Wybierz opcję: ");
        System.out.println(EXIT + " - wyjście z programu");
        System.out.println(ADD_BOOK + " - dodanie nowej książki");
        System.out.println(PRINT_BOOKS + " - wyświetl dostępne książki");
        System.out.println("---------------");
    }


    private void addBook() {
        if (library.getBooksNumber() == library.getMAX_BOOKS()) {
            System.out.println("Brak miejsca");
        } else {
            Book newBook = dataReader.readAndCreateBook();
            library.addBook(newBook);
        }

    }

    public void printBooks(Library library) {
        if (library.getBooksNumber() == 0) {
            System.out.println("W bibliotece nie ma ksiązek.");
        } else {
            for (int i = 0; i < library.getBooksNumber(); i++) {
                library.getBooks()[i].printInfo();
                System.out.println("--------------------------");
            }
        }
    }

    public void printInfo() {
        System.out.println("System może przechowywać do " + library.getMAX_BOOKS() + " książek");
    }


}

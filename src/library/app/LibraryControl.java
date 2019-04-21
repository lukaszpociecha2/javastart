package library.app;

import com.sun.xml.internal.bind.v2.TODO;
import library.io.DataReader;
import library.model.Book;
import library.model.Library;
import library.model.Magazine;

import static library.model.Library.getMAX_BOOKS;

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
                case ADD_MAGAZINE :
                    addMagazines();
                    break;
                case PRINT_MAGAZINES :
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


    private void addBook() {
        if (library.getBooksNumber() == getMAX_BOOKS()) {
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

    public void addMagazines(){
        if (library.getMagazinesNumber() == library.getMaxMagazines()) {
            System.out.println("Maksymalna liczba magazynów osiągnięta.");
        } else {
            library.addMagazine(dataReader.readAndCreateMagazine());
        }
    }

    public void printMagazines(){
        if (library.getMagazinesNumber()==0){
            System.out.println("W bibliotece nie ma magazynów");
        } else {
            for (Magazine magazine : library.getMagazines()) {
                magazine.printInfo();
            }
        }
    }


    public void printInfo() {
        System.out.println("System może przechowywać do " + getMAX_BOOKS() + " książek");
    }


}

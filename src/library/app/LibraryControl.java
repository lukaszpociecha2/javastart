package library.app;

import library.exception.NoSuchOptionException;
import library.io.ConsolePrinter;
import library.io.DataReader;
import library.model.Book;
import library.model.Library;

import java.util.InputMismatchException;


import static library.model.Library.getMaxPublications;


public class LibraryControl {

    private Library library = new Library();
    private ConsolePrinter consolePrinter = new ConsolePrinter();
    private DataReader dataReader = new DataReader(consolePrinter);

    public LibraryControl() {
        System.out.println("Witaj w bibliotece.");
    }

    public void controlLoop() {

        int option;
        Option user_option;
        do {
            printOptions();

            user_option = getOption();
            switch (user_option) {
                case EXIT:
                    System.out.println("Koniec programu");
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case READ_ALL_BOOKS:
                    printBooks();
                    break;
                case ADD_MAGAZINE:
                    addMagazines();
                    break;
                case READ_ALL_MAGAZINES:
                    printMagazines();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");

            }
        } while (user_option != Option.EXIT);

        dataReader.close();
    }

    private void printOptions() {

        System.out.println("Wybierz opcję: ");

        for (Option o : Option.values()
        ) {
            System.out.println(o.getOption() + " - " + o.getDescription());
        }

        System.out.println("---------------");
    }

    private Option getOption() {
        boolean optionOK = false;
        Option option = null;
        do {
            try {
                option = Option.getOptionFromInt(dataReader.getInt());
                optionOK = true;

            } catch (InputMismatchException e) {
                consolePrinter.printLine("Wprowadziłeś wartośc która nie jest liczbą, podaj ponownie");

            } catch (NoSuchOptionException e) {
                consolePrinter.printLine(e.getMessage() + "Wybierz ponownie.");
            }
        } while (!optionOK);
        return option;
    }

    //add book + print books
    private void addBook() {
        try {
            Book newBook = dataReader.readAndCreateBook();
            library.addPublication(newBook);
        } catch (InputMismatchException e){
            consolePrinter.printLine("Niepoprawny format danych.");

        } catch (ArrayIndexOutOfBoundsException e){
            consolePrinter.printLine("Brak miejsca w bibliotece");
        }
    }

    public void printBooks(){
        consolePrinter.printBooks(library.getPublications());
    }
    // add magazine + print magazines

    public void addMagazines() {
        try {
            library.addPublication(dataReader.readAndCreateMagazine());
        } catch (InputMismatchException e){
            consolePrinter.printLine("Niepoprawny format danych.");

        } catch (ArrayIndexOutOfBoundsException e){
            consolePrinter.printLine("Brak miejsca w bibliotece");
        }
    }

    public void printMagazines(){
        consolePrinter.printMagazines(library.getPublications());
    }



    public void printInfo() {
        System.out.println("System może przechowywać do " + getMaxPublications() + " książek");
    }


    private enum Option {

        EXIT(0, "wyjście z programu"),
        ADD_BOOK(1, "dodaj książkę"),
        READ_ALL_BOOKS(2, "pokaż książki"),
        ADD_MAGAZINE(3, "dodaj magazyn"),
        READ_ALL_MAGAZINES(4, "pokaż wszystkie magazyny");
        //ERROR; zastąpiony NoSuchOptionException

        private int option;
        private String description;

        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }

        Option(){}

        public int getOption() {
            return option;
        }

        public String getDescription() {
            return description;
        }

        static Option getOptionFromInt(int user_option) throws NoSuchOptionException {

            /*for (Option o : Option.values()
            ) {
                if (o.option == user_option)
                    return o;
            }*/ // substituted with return value of index=user_option of array of Option enum
            try {
                return Option.values()[user_option];
            } catch (ArrayIndexOutOfBoundsException e) {

                throw new NoSuchOptionException("Nie ma takiej opcji ");
            } // caught ArrayIndexOutOfBoundsException and instead thrown NoSuchOptionException
        }

    }
}

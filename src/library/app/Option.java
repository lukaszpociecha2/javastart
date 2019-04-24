package library.app;

import library.exception.NoSuchOptionException;

import javax.xml.bind.annotation.XmlType;

public enum Option {

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
        } // caught ArrayIndexOutOfBoundsException and insted thrown NoSuchOptionException
    }

}

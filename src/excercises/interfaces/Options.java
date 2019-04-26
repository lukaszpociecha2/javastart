package excercises.interfaces;

import excercises.exceptions.NoElementFoundException;

public enum Options {


    RECTANGLE(1), TRIANGLE(2), CIRCLE(3);
    private int choice;

    Options(int choice) {
        this.choice = choice;
    }

    public int getChoice(){
        return choice;
    }

    public static Options getOptionFromUser(int intFromUser) throws NoElementFoundException{

        for (Options value : Options.values()) {
            if (value.choice==intFromUser){
                return value;
            }

        }

        throw new NoElementFoundException("błędny wybór");
    }
}

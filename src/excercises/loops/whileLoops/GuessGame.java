package excercises.loops.whileLoops;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        final int answer = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbę");
        int userInput;
        while ((userInput = scanner.nextInt()) != 7) {

            if (userInput > answer) System.out.println("Nie zgadles. Liczba za duża. Sprobuj ponownie");
            else {
                System.out.println("Nie zgadles. Liczba za mała. Sprobuj ponownie.");
            }
        }

        System.out.println("Brawo");
        scanner.close();
    }

}

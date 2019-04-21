package excercises;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

    private static final int EXIT = 0;

    private static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start, end;
        do {
            System.out.println("Pierwsza liczba: ");
            start = input.nextInt();
            System.out.println("Druga liczba: ");
            end = input.nextInt();
            printNumbers(start, end);

            System.out.println("Koniec programu, wprowadź 0");
            System.out.println("Kontynuuj, wprowadź 1");
        } while (input.nextInt() != EXIT);

        input.close();
    }
}

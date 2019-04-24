package excercises.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę całkowitą");
        int number = 0;
        boolean error = true;
        Scanner sc = new Scanner(System.in);
        do {

            try {
                number = sc.nextInt();
                sc.nextLine(); //tutaj dla porządku też, bo jeśli nextInt dostanie prawidłowy typ, to mozna usunąć z buffora znak nowej linii
                error = false;


            } catch (InputMismatchException e) {
                sc.nextLine();  // TO JEST ISTOTNE W TYM MIEJSCU ZEBY SIE POZBYĆ Z BUFFORA PAMIECI NOWEJ LINII, którego nie zdązyła usunąć sc.nextLine() powyżej bo wykonanie programu tam nie doszło
                                // bo wyrzucilo bląd przed tą linijką
                System.err.println("Zly format");
            }

        } while (error);
        sc.close();

        System.out.println("Podales: " + number);
    }
}

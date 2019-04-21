package excercises.standardInput;

import java.util.Locale;
import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN);
        System.out.println("Podaj liczbę a");
        double a = scanner.nextDouble();
        scanner.nextLine(); // consume new line after number is read
        System.out.println("Podaj liczbę b");
        double b = scanner.nextDouble();
        scanner.nextLine(); // consume new line after number is read

        scanner.close();

        System.out.println("Suma dodawania to: " + a + " + " + b + " = " + (a + b));
    }
}

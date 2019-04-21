package excercises.standardInput;

import java.util.Scanner;

public class InOut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName= scanner.nextLine();
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        System.out.println("Imię: " + firstName + ", nazwisko: " + lastName + ", wiek: " + age);
    }


}

package excercises.exceptions;

import java.util.Scanner;

public class TestTryFinally {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz liczbe");
        try {

            System.out.println(scanner.nextInt());
        } finally {
            scanner.nextLine();
        }

    }


}

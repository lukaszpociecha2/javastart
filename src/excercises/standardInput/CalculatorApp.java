package excercises.standardInput;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbe");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj znak dzialania");
        String operator = scanner.nextLine();
        System.out.println("Podaj druga liczbe");
        double b = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
        Calculator calculator = new Calculator();
        System.out.println("Wynik dzialania to: " + calculator.calculate(a, b, operator));
    }
}

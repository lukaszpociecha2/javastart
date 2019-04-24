package excercises.exceptions;

import sun.plugin2.liveconnect.ArgumentHelper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    private double a;
    private double b;
    private String operator;
    Scanner scanner = new Scanner(System.in);

    public void getData() throws IllegalArgumentException {
        boolean error = true;

        do {
            try {
                System.out.println("Podaj pierszą liczbę");
                a = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Podaj drugą zmienną");
                b = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Podaj operator: +, - / lub \\, *");
                String localOperator = scanner.nextLine();
                if (localOperator.equals("+") ||
                        localOperator.equals("-") ||
                        localOperator.equals("\\") ||
                        localOperator.equals("/") ||
                        localOperator.equals("*")) {
                    this.operator = localOperator;
                    error = false;
                    System.out.println("Operator ok");
                } else {
                    throw new IllegalArgumentException("Zły znak");
                }
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowe dane");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


        } while (error);

    }

    public double calculate() throws ArithmeticException {
        double result = 0;
        switch (operator) {
            case "+":
                result = this.a + this.b;
                break;

            case "-":
                result = this.a - this.b;
                break;

            case "*":
                result = this.a * this.b;
                break;

            case "/":
            case "\\":
                if (this.b == 0) {
                    throw new ArithmeticException("Nie dziel przez zero");
                }
                result = this.a / this.b;
                break;
        }
        System.out.println("Wynik: " + result);

        scanner.close();

        return result;

    }

}

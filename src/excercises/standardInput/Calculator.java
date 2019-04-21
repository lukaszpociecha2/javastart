package excercises.standardInput;

import java.util.Scanner;

public class Calculator {

    public double calculate(double a, double b, String operator) {

        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;

            case "*":
                result = a * b;
                break;
            case "/":
            case "\\":
                result = a / b;
                break;

            default:
                System.out.println("Coś poszło nie tak");
        }
        return result;


    }

}

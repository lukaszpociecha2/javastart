package excercises.enums;

import java.util.Arrays;
import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Arrays.stream(Pizza.values()).forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pizzę: MARGHARITA, CAPRICIOSA, PROSCIUTTO:");
        String pizza = scanner.nextLine();

        System.out.println("Wybrałeś pizzę: " + Pizza.getPizzaType(pizza).toString());

    }

}

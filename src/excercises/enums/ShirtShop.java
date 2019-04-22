package excercises.enums;

import java.util.Arrays;
import java.util.Scanner;

public class ShirtShop {
    public static void main(String[] args) {
        /*System.out.println("Dostępne rozmiary:");
        System.out.println(Size.SMALL.getDescription());
        System.out.println(Size.MEDIUM.getDescription());
        System.out.println(Size.LARGE.getDescription());*/

        Tshirt tshirt = new Tshirt();


        System.out.println(tshirt.getSize());

        /*for (Size value : Size.values()) {
            System.out.println(value);
        }

        System.out.println("Klasa wyniku Enum.valueOf():" + Size.valueOf("LARGE").getClass().getSimpleName());

        System.out.println("Klasa wyniku Enum.name():" + Size.SMALL.name().getClass().getSimpleName());

        System.out.println(Size.LARGE.ordinal());

        for (Size s:Size.values()
             ) {
            System.out.println(s.getClass().getName());
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar: small, medium, big : ");
        String size = scanner.nextLine();
        scanner.close();

        tshirt.setSize(Size.getSize(size));
        System.out.println(tshirt.getSize().getOpis());


    }
}

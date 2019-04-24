package excercises.string;

import java.util.Scanner;

public class StringExcedrcise {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę słów");
        Scanner scanner = new Scanner(System.in);
        int numberOfWords=scanner.nextInt();
        scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <numberOfWords ; i++) {
            System.out.println("Podaj wyraz: ");
            String temp = scanner.nextLine();
            stringBuilder.append(temp.charAt(temp.length()-1));
        }
        scanner.close();
        System.out.println("Wynik: " + stringBuilder.toString());
    }

}

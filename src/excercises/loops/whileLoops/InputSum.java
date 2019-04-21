package excercises.loops.whileLoops;

import java.util.Scanner;

public class InputSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("Podaj ilosc czynnikow");
        i = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;
        while (i-- > 0) {
            System.out.println("Podaj liczbę");
            sum += scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Suma liczb to: " + sum);
        scanner.close();

    }

}

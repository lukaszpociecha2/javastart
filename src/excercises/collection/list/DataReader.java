package excercises.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {

    List<Integer> integers = new ArrayList<>();


    public void getInts() {
        Scanner scanner = new Scanner(System.in);
        boolean EXIT = false;
        System.out.println("Podaj liczby do zsumowania lub EXIT do wyjścia.");
        while (!EXIT) {
            System.out.println("Podaj liczbę");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                try {
                    Integer i = (Integer) Integer.parseInt(input);
                    integers.add(i);
                } catch (NumberFormatException e) {
                    System.out.println("Nie podałeś liczby");
                }
            }

        }
        scanner.close();
    }

    public int sum(List<Integer> list){

        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        return sum;
    }

}

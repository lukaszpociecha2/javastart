package excercises.loops.fors;

import java.util.Scanner;

public class ForEachProblem {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int tmp : numbers) {
            System.out.println("Podaj liczbę");
            tmp = sc.nextInt();
        }

        for (int tmp : numbers) {
            System.out.println(tmp);
        }

        sc.close();

    }
}

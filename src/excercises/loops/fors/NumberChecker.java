package excercises.loops.fors;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tmp;

        for(int i=0; i<3; i++){
            System.out.println("Podaj liczbę");
            tmp = scanner.nextInt();
            if(tmp%2==0){
                System.out.println("Liczba parzysta");
            } else {
                System.out.println("Liczba nieparzysta");
            }
        }

        scanner.close();
    }

}

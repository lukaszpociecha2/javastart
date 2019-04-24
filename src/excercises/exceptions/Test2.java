package excercises.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[2];

        System.out.println("Podaj dwie liczby");
        boolean error = true;

        do {
            try{

                System.out.println("Podaj pierwszą liczbę: ");
                ints[0]=scanner.nextInt();
                scanner.nextLine();

                System.out.println("Podaj drugą liczbę: ");
                ints[1]=scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ktorą liczbę wyświetlic: 1 czy 2? :");
                System.out.println("Wybrana liczba to" + ints[scanner.nextInt()-1]);
                //scanner.nextLine(); // to mozna przeniesc do bloku finally

                error=false;

            } catch (InputMismatchException e){
                System.out.println("Nie podales liczby calkowitej. Spróbuj jeszcze raz");
                // scanner.nextLine(); // to mozna przeniesc do bloku finally
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Podales niewlasciwa pozycje z tablicy. Zacznijmy od nowa");
                // scanner.nextLine(); // to mozna przeniesc do bloku finally
            } finally {
                scanner.nextLine();
            }


        } while (error);
        scanner.close();


    }

}

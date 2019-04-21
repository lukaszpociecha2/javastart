package excercises.loops.excercise;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w programie. Co chcesz zrobic?");
        System.out.println("0 - wyjscie z programu, 1 - dodanie pacjenta, 2 - wyświetl wszystkich pacjentow");

        int userChoice;

        while ((userChoice = scanner.nextInt()) != 0) {
            scanner.nextLine();
            switch (userChoice) {
                case 1:
                    System.out.println("Ilośc wolnych miejsc: " + hospital.freeSpots());
                    Patient patient1 = new Patient();

                    System.out.println("Podaj imie");
                    patient1.setFirstName(scanner.nextLine());

                    System.out.println("Podaj nazwisko");
                    patient1.setLastName(scanner.nextLine());

                    System.out.println("Podaj pesel");
                    patient1.setPesel(scanner.nextLine());

                    hospital.addPatient(patient1);
                    System.out.println("Ilośc wolnych miejsc: " + hospital.freeSpots());
                    System.out.println("Wybierz opcję");
                    System.out.println("0 - wyjscie z programu, 1 - dodanie pacjenta, 2 - wyświetl wszystkich pacjentow");

                    break;

                case 2:
                    hospital.printAllPatients();
                    System.out.println("Wybierz opcję");
                    System.out.println("0 - wyjscie z programu, 1 - dodanie pacjenta, 2 - wyświetl wszystkich pacjentow");
                    break;

                default:
                    System.out.println("Zły wybor. Jeszcze raz");
                    System.out.println("0 - wyjscie z programu, 1 - dodanie pacjenta, 2 - wyświetl wszystkich pacjentow");
            }
        }
        scanner.close();
        System.out.println("Dziękujemy za skorzystanie z programu");

    }

}



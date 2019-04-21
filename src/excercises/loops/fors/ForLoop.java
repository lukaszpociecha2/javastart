package excercises.loops.fors;

public class ForLoop {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Liczba: " + numbers[i]);
        }
    }

}

package excercises.camparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Numbers{

    public static void main(String[] args) {

        Integer[] numbers = new Integer[] {1, 150, 13, 65, 201, -54, 42 , -131};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }

            @Override
            public Comparator<Integer> reversed() {
                return null;
            }
        });

        System.out.println("Sorted: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }



    }

}

package excercises.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrTest {

    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,};
        List<Integer> intList = Arrays.asList(integers);
        List<Integer> newIntList = new ArrayList<>(); //nie modyfikowalna (bo nie wiadomo jakiego rodzaju Lista?)

        // mozna dodać do pustej kolekcji np. ArrayList

        newIntList.addAll(intList);
        newIntList.add(5);
        System.out.println(newIntList);

        List<Integer> newLinkedList = new LinkedList<>();
        newLinkedList.addAll(intList);
        newLinkedList.add(6);

        System.out.println(newLinkedList);





    }

}

package excercises.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionOperation {
    public static void main(String[] args) {
        String sentence = "Strona testowa służy dwóm celom: stanowi wizualne potwierdzenie "
                + "działania drukarki i może również zawierać informacje pomocne podczas "
                + "rozwiązywania problemów, takie jak szczegóły dotyczące sterownika drukarki.";
        List<String> word = Arrays.asList(sentence.split(" "));
        //Collections.shuffle(word);
        Collections.sort(word, String.CASE_INSENSITIVE_ORDER);
        for (String s : word) {
            System.out.println(s);
        }

    }

}

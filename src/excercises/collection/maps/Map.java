package excercises.collection.maps;

import java.util.Comparator;
import java.util.TreeMap;

public class Map {

    public static void main(String[] args) {

        java.util.Map<String, String> map = new TreeMap<>(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });




    }
}

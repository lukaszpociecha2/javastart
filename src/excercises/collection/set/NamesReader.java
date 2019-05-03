package excercises.collection.set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class NamesReader {

    public static void main(String[] args) {

        Set<String> names = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareToIgnoreCase(o2);
            }
        });

        String fileName = "namespl.txt";
        try(FileReader fr = new FileReader(fileName);
                            BufferedReader buffReader = new BufferedReader(fr);)
        {
            String temp;
            while((temp=buffReader.readLine())!=null){
                names.add(temp);
            }

        } catch (IOException e){
            System.out.println("Something went wrong");
        }

        System.out.println("Ilość imion: " + names.size());
        System.out.println("Imiona w alfabetycznym porządku: \n" + names);
        System.out.println("Pierwsze imię: " + ((TreeSet<String>) names).first());
        System.out.printf("Ostatnie imię: %s%n", ((TreeSet<String>) names).last());

    }

}

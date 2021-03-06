package library.io;

import library.model.Book;
import library.model.Library;
import library.model.Magazine;
import library.model.Publication;
import library.model.comparator.AlphabeticalTitleComparator;

import java.util.Arrays;
import java.util.Comparator;

public class ConsolePrinter {

    public void printBooks(Publication[] library) {
        int booksCount = 0;
        Arrays.sort(library, new AlphabeticalTitleComparator());
        for (Publication publication : library) {
            if(publication instanceof Book){
                System.out.println(publication.toString());
                booksCount++;
            }
        }
        if (booksCount==0) printLine("Brak książek");
    }

    public void printMagazines(Publication[] library) {
        int magazinesCount = 0;
        Arrays.sort(library, new AlphabeticalTitleComparator());
        for (Publication publication : library) {
            if(publication instanceof Magazine){
                System.out.println(publication.toString());
                magazinesCount++;
            }
        }
        if (magazinesCount==0) printLine("Brak magazynów");
    }

        public void printLine(String text){
            System.out.println(text);
        }




}

package library.model.comparator;

import library.model.Publication;

import java.util.Comparator;

public class YearComparator implements Comparator<Publication> {

    @Override
    public int compare(Publication o1, Publication o2) {
        return o1.getYear()-o2.getYear();
    }
}

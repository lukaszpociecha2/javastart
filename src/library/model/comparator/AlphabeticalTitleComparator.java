package library.model.comparator;

import library.model.Publication;

import java.util.Comparator;

public class AlphabeticalTitleComparator implements Comparator<Publication> {

    @Override
    public int compare(Publication p1, Publication p2) {

        return p1.getTitle().compareToIgnoreCase(p2.getTitle());
    }
}

package GetraenkeUB05;

import java.util.Comparator;

public class AnzahlZutatenComparator implements Comparator<Getraenke> {

    @Override
    public int compare(Getraenke o1, Getraenke o2) {
        return Integer.compare(o1.getAnzahlZutaten(), o2.getAnzahlZutaten());
    }
}

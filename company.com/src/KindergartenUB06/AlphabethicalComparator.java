package KindergartenUB06;

import java.util.Comparator;

public class AlphabethicalComparator implements Comparator<Kind> {

    @Override
    public int compare(Kind o1, Kind o2) {
        String o1Name = o1.getZuname() + " " + o1.getVname();
        String o2Name = o2.getZuname() + " " + o2.getVname();
        return o1Name.compareTo(o2Name);
    }
}

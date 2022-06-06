package KindergartenUB06;

import java.util.Comparator;

public class AgeComparator implements Comparator<Kind> {

    @Override
    public int compare(Kind o1, Kind o2) {

        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

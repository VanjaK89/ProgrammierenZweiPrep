package GetraenkeUB05;

import java.util.ArrayList;
import java.util.Collections;

public class RegistrierKasse {
    private static int verkaufteGetraenke = 0;

    ArrayList<Getraenke> getraenkes = new ArrayList<>();

    public RegistrierKasse() {
        this.getraenkes = getraenkes;
    }

    public static int getVerkaufteGetraenke() {
        return verkaufteGetraenke;
    }

    public ArrayList<Getraenke> getGetraenkes() {
        return getraenkes;
    }

    public void verkauft(Getraenke g){
        getraenkes.add(g);
        ++verkaufteGetraenke;
    }
    public void printGaetrenkeSortierNachAnzahlZutaten(){
        Collections.sort(getraenkes, new AnzahlZutatenComparator());
    }
    public void printGaetrenkeSortiertNachMi(){
        Collections.sort(getraenkes, new MiComparator());
    }
}

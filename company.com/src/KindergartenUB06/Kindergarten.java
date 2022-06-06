package KindergartenUB06;


import java.util.ArrayList;
import java.util.Collections;

public class Kindergarten {
    private String klasse;
    private ArrayList<Kind> kinder = new ArrayList<>();

    public Kindergarten(String klasse) {
        this.klasse = klasse;
        this.kinder = kinder;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public ArrayList<Kind> getKinder() {
        return kinder;
    }

    public void setKinder(ArrayList<Kind> kinder) {
        this.kinder = kinder;
    }

    public void addKinder(Kind k){
        kinder.add(k);
    }
    public void sortAlphabethical(){

        Collections.sort(kinder, new AlphabethicalComparator());

    }

    public void  sortAge(){
        Collections.sort(kinder, new AgeComparator());
    }
}

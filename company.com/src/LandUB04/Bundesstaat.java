package LandUB04;

import java.util.ArrayList;

public class Bundesstaat extends Land{

    ArrayList<Land> lands = new ArrayList<>();

    public Bundesstaat() {
        this.lands = lands;
    }

    public void add(Land l){
        lands.add(l);
    }

    @Override
    public double getBruttoSocialProduct() {
        double summe = 0;
        for(Land l: lands){

            summe = summe + l.getBruttoSocialProduct();
        }
        return summe;
    }

    @Override
    public String toString() {
        return "Bundesstaat{" +
                "lands=" + lands +
                '}';
    }
}

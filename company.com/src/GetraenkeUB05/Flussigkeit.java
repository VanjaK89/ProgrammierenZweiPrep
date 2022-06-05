package GetraenkeUB05;

public class Flussigkeit {
    private String name;
    private double menge;
    private double alcoholProzent;

    public Flussigkeit(String name, double menge, double alcoholProzent) {
        this.name = name;
        this.menge = menge;
        this.alcoholProzent = alcoholProzent;
    }

    public String getName() {
        return name;
    }

    public double getMenge() {
        return menge;
    }

    public double getAlcoholProzent() {
        return alcoholProzent;
    }
}

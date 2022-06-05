package GetraenkeUB05;

public abstract class Getraenke implements Brennbar {
    protected String name;

    public Getraenke(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Getraenke{" +
                "name='" + name + '\'' + getAnzahlZutaten() + "anzahl " + mengelnM() + beinhaltetAlkohol() + brennt() +
                '}';
    }

    public abstract int getAnzahlZutaten();
    public abstract boolean beinhaltetAlkohol();
    public abstract double mengelnM();
}

package GetraenkeUB05;

public class LongDrink extends Getraenke{
    protected Flussigkeit sprirtuose;
    protected Flussigkeit filler;

    public LongDrink(String name) {
        super(name);
    }

    @Override
    public int getAnzahlZutaten() {
        return 0;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        return false;
    }

    @Override
    public double mengelnM() {
        return 0;
    }

    @Override
    public boolean brennt() {
        return false;
    }

}

package GetraenkeUB05;

public class SimplesGetraenk extends Getraenke{
    protected Flussigkeit bestandteil;

    public SimplesGetraenk(String name) {
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
        return bestandteil.getMenge();
    }

    @Override
    public boolean brennt() {
        return false;
    }
}

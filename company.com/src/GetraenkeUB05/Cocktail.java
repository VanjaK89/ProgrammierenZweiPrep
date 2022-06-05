package GetraenkeUB05;

import java.util.ArrayList;

public class Cocktail extends Getraenke {
    ArrayList<Flussigkeit> flussigkeits = new ArrayList<>();

    public Cocktail(String name) {
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

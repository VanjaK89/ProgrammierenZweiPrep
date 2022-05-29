package KontoUB04;

public class JugendGiroKonto extends GiroKonto{

    protected double buchungsLimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungsLimit) {
        super(inhaber, limit);
        this.buchungsLimit = buchungsLimit;
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if (wert > buchungsLimit){
            return super.auszahlen(buchungsLimit);
    }
        return  super.auszahlen(wert);

    }
}

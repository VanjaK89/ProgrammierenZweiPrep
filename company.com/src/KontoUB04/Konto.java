package KontoUB04;

public class Konto {
    protected String inhaber;
    protected double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        kontostand = 0;
    }

    public void einzahlen(double wert){
        if(wert < 0){
            return;
        }
        kontostand =+ wert;

    }
    public double auszahlen(double wert){
       if(wert < 0){
           return 0;
       }
        kontostand -= wert;
       return wert;
    }
}

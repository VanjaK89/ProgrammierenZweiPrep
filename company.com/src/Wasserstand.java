public class Wasserstand {
    private int id;
    private String gewaessername;
    private String Ort;
    private double messWert;
    private double messWertFuerAlarmierung;
    private int zeitpunkt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewaessername() {
        return gewaessername;
    }

    public void setGewaessername(String gewaessername) {
        this.gewaessername = gewaessername;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlarmierung() {
        return messWertFuerAlarmierung;
    }

    public void setMessWertFuerAlarmierung(double messWertFuerAlarmierung) {
        this.messWertFuerAlarmierung = messWertFuerAlarmierung;
    }

    public int getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", gewaessername='" + gewaessername + '\'' +
                ", Ort='" + Ort + '\'' +
                ", messWert=" + messWert +
                ", messWertFuerAlarmierung=" + messWertFuerAlarmierung +
                ", zeitpunkt=" + zeitpunkt +
                '}';
    }
}

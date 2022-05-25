import java.util.ArrayList;

public class WasserstandManager {

    private ArrayList<Wasserstand> wasserstands = new ArrayList<>();

    public void add(Wasserstand w) {
        wasserstands.add(w);
    }

    public Wasserstand findByInt() {
        int id = 0;
        for (Wasserstand w : wasserstands) {
            if (id == w.getId()) {
                return w;
            }
        }
        return null;
    }
    public ArrayList<Wasserstand>findAllByGewaesser(String gewaesserName){
        ArrayList<Wasserstand> wsList = new ArrayList<>();
        for(Wasserstand w: wasserstands){
            if(gewaesserName.equals(w.getGewaessername())){
                wsList.add(w);
            }
        }
        return wsList;

    }
    public Wasserstand findLastWasserstand(String gewaesserName){
        Wasserstand erg = null;
        for(Wasserstand w: findAllByGewaesser(gewaesserName)){
            if(erg == null || erg.getZeitpunkt() < w.getZeitpunkt()){
                erg = w;
            }

        }
        return erg;
    }

    public ArrayList<Wasserstand>findForAlarmierung(){
        ArrayList<Wasserstand> wList = new ArrayList<>();

        for(Wasserstand w: wasserstands){
            if(w.getMessWert() >= w.getMessWertFuerAlarmierung()){
                wList.add(w);
            }
        }
        return wList;
    }

    public double calcMittlererWasserstand(String gewaesserName, String ort){
        double mw = 0;
        int anzahl = 0;

        for(Wasserstand w : wasserstands)
        {
            if(w.getGewaessername().equals(gewaesserName) && w.getOrt().equals(ort))
            {
                mw += w.getMessWert();
                anzahl += 1;
            }
        }

        return mw / anzahl;
    }
    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String gewaesserName, String ort)
    {
        ArrayList<Wasserstand> erg = new ArrayList<Wasserstand>();

        for(Wasserstand w : wasserstands)
        {
            if(w.getGewaessername().equals(gewaesserName) && w.getOrt().equals(ort) &&
                    w.getZeitpunkt() >= von && w.getZeitpunkt() <= bis)
            {
                erg.add(w);
            }
        }
        return erg;

    }

    @Override
    public String toString() {
        return "WasserstandManager{" +
                "wasserstands=" + wasserstands +
                '}';
    }
}

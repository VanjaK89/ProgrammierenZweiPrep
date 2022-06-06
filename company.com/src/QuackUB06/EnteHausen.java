package QuackUB06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnteHausen {

    private ArrayList<Ente> enten = new ArrayList<>();

    public void addEnte(Ente e){
        enten.add(e);
    }

    public Map<Integer, List<Ente>>getGruppierteEnten() {
        HashMap<Integer, List<Ente>> el = new HashMap<Integer, List<Ente>>();
        ArrayList<Ente> e100, e200, e300;
        e100 = new ArrayList<Ente>();
        e200 = new ArrayList<Ente>();
        e300 = new ArrayList<Ente>();

        for (Ente e : enten) {
            if (e.getFullWeight() <= 100) {
                e100.add(e);
            }
            else if (e.getFullWeight() <= 200) {
                e200.add(e);
            }
            else {
                e300.add(e);
            }
        }
        el.put(100, e100);
        el.put(200, e200);
        el.put(300, e300);
        return el;
    }



}

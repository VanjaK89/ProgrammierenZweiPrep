import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {

    private ArrayList<Event> events = new ArrayList<>();

    public EventKalender() {
        this.events = events;
    }
    public void add(Event e){

        events.add(e);
    }
    public Event getByTitle(String title){
        for(Event e: events){
            if(title.equals(e.getTitle())){
                return e;
            }
        }
        return null;
    }

    public ArrayList<Event>getByOrt(String ort){

        ArrayList<Event> evs = new ArrayList<>();
        for(Event e: events){
            if(ort.equals(e.getOrt())){
                evs.add(e);
            }
        }
        return evs;
    }
    public ArrayList<Event>getByEintrittsPreis(double min, double max){
        ArrayList<Event> evs = new ArrayList<>();
        for (Event e: events){
            if(e.getEintrittsPreis() >= min && e.getEintrittsPreis() <= max)
            {
                evs.add(e);
            }
        }
        return evs;
    }

    public Event getMostExpensiveByOrt(String ort){
        Event evt = null;
        for(Event e: events){
            if(e.getOrt().equals(ort) && (evt == null || e.getEintrittsPreis() > evt.getEintrittsPreis())){

                evt = e;

            }
        }
        return evt;
    }

    public double getByAvaragePrByOrt(String ort){
        double avgSumm = 0;
        int zaehler = 0;

    for(Event e: events){
        if(e.getOrt().equals(ort)){
            avgSumm =+ e.getEintrittsPreis();
            zaehler =+1;
        }
    }
    return  avgSumm / zaehler;
    }

    public HashMap<String, Integer> getCountEventsByOrt(){
        HashMap<String, Integer> erg = new HashMap<String, Integer>();
        for(Event e: events){
            if(erg.containsKey(e.getOrt())){
                erg.put(e.getOrt(), 1+erg.get(e.getOrt()));
            }
            else{
                erg.put(e.getOrt(), 1);
            }
        }
        return erg;
    }
    public HashMap<String, Double>getSumPriceEventsByOrt(){
        HashMap<String, Double> erg = new HashMap<String, Double>();
        for(Event e: events){
            if(erg.containsKey(e.getOrt())){
                erg.put(e.getOrt(), e.getEintrittsPreis() + erg.get(e.getOrt()));
            }
            else
            {
                erg.put(e.getOrt(), e.getEintrittsPreis());
            }
        }
        return erg;
    }

    @Override
    public String toString() {
        return "EventKalender{" +
                "events=" + events +
                '}';
    }

}

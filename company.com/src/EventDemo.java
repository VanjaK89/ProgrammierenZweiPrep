import java.util.ArrayList;

public class EventDemo {
    public static void main(String[] args) {

        Event e1 = new Event("Konzert", "Graz", 12.99);
        Event e2 = new Event("Kino", "Graz", 2.99);
        Event e3 = new Event("Strandbad", "Klagenfurt", 8.99);
        Event e4 = new Event("Konzert", "Graz", 10.99);

        EventKalender ek = new EventKalender();
        ek.add(e1);
        ek.add(e2);
        ek.add(e3);
        ek.add(e4);
        System.out.println(ek);
        System.out.println(ek.getByTitle("Kino"));
        System.out.println(ek.getByOrt("Graz"));
        System.out.println(ek.getByEintrittsPreis(2.99, 12.99));
        System.out.println(ek.getMostExpensiveByOrt("Graz"));
        System.out.println(ek.getByAvaragePrByOrt("Graz"));
        System.out.println(ek.getCountEventsByOrt());
        System.out.println(ek.getSumPriceEventsByOrt());


    }
}

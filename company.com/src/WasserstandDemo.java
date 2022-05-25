public class WasserstandDemo {
    public static void main(String[] args) {

        Wasserstand w1 = new Wasserstand(1,"Name", "Graz", 12.45, 58.03,5 );
        Wasserstand w2 = new Wasserstand(2, "Name2", "Graz", 6.99, 38.09,10);
        Wasserstand w3 = new Wasserstand(3, "Name3", "Graz", 8.09, 27.89, 83);
        Wasserstand w4 = new Wasserstand(4, "Name4", "Graz", 9.09, 47.89, 53);
        Wasserstand w5 = new Wasserstand(5, "Name3", "Graz", 60.09, 47.89, 23);
        Wasserstand w6 = new Wasserstand(6, "Name3", "Graz", 3.09, 27.89, 83);

        WasserstandManager wmng = new WasserstandManager();

        wmng.add(w1);
        wmng.add(w2);
        wmng.add(w3);
        wmng.add(w4);
        wmng.add(w5);
        wmng.add(w6);
        System.out.println(wmng);

        System.out.println(wmng.findAllByGewaesser("Name3"));
        System.out.println(wmng.findLastWasserstand("Name3"));
        System.out.println(wmng.findForAlarmierung());
        System.out.println(wmng.calcMittlererWasserstand("Name3", "Graz"));
        System.out.println(wmng.findByZeitpunkt(1, 8, "Name", "Graz"));


    }
}

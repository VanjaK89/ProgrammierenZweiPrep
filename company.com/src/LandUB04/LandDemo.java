package LandUB04;

public class LandDemo {
    public static void main(String[] args) {
        Bundesstaat b = new Bundesstaat();
        Bundesland b1 = new Bundesland(20000.0);
        Bundesland b2 = new Bundesland(50000.0);

        b.add(b1);
        b.add(b2);
        System.out.println(b.getBruttoSocialProduct());
        System.out.println(b);
    }
}

package KontoUB04;

public class KontoDemo {
    public static void main(String[] args) {
        JugendGiroKonto konto = new JugendGiroKonto("Maxi", 1000, 500);
        Konto k = (Konto) konto;
        k.einzahlen(1000);
        System.out.println(k.kontostand);
        k.auszahlen(500);
        System.out.println(k.kontostand);

        GiroKonto g = (GiroKonto) k;
        g.einzahlen(700);
        System.out.println(g.kontostand);
        g.auszahlen(300);
        System.out.println(g.kontostand);
    }
}

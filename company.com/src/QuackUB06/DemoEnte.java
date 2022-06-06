package QuackUB06;

public class DemoEnte {
    public static void main(String[] args) {
        EnteHausen eh = new EnteHausen();

        eh.addEnte(new BadeEnte("Patak", 3));
        eh.addEnte(new BadeEnte("Patka", 4));
        eh.addEnte(new FlugEnte("Leteci", 2));

        eh.getGruppierteEnten();
        System.out.println(eh.getGruppierteEnten());
        System.out.println();

    }
}

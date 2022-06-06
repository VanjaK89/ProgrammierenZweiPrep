package KindergartenUB06;

public class KindDemo {
    public static void main(String[] args) {

        Kindergarten kg = new Kindergarten("RG");

        kg.addKinder(new Kind("Hansi", "Hak", 3));
        kg.addKinder(new Kind("Susi", "Mayer", 4));
        kg.addKinder(new Kind("Maxi", "Max", 5));

        System.out.println(kg.getKinder());

        kg.sortAlphabethical();
        System.out.println(kg.getKinder());
        kg.sortAge();
        System.out.println(kg.getKinder());

    }
}

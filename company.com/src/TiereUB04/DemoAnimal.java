package TiereUB04;

public class DemoAnimal {
    public static void main(String[] args) {
        Frog quaxi = new Frog("green", 2);
        Animal quaxiAsAnimal = quaxi;
        Frog sameQuaxi = (Frog)quaxiAsAnimal;

        quaxi.walk();
        quaxi.makeNoise();
        quaxiAsAnimal.makeNoise();
        sameQuaxi.makeNoise();

        Nature n = new Nature();
        n.addAnimal(quaxi);
        n.addAnimal(new Lion("brown", 8));
        n.addAnimal(new Frog("green", 2));
        n.countColor("green");
        System.out.println(n.countColor("brown"));

    }
}

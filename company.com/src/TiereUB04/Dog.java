package TiereUB04;

public class Dog extends Animal{
    protected String name;
    public Dog(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void walk() {
        super.walk();
    }
}

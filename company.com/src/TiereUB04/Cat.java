package TiereUB04;

public class Cat extends Animal{
    protected String name;
    public Cat(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }
}

package TiereUB04;

public abstract class Animal {
    protected String color;
    protected int countEyes;

    public Animal(String color, int countEyes) {
        this.color = color;
        this.countEyes = countEyes;
    }
    public void walk(){
        System.out.println("jumping");
    }
    public void makeNoise(){
        System.out.println("quak");
    }

}

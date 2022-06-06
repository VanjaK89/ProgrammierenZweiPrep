package QuackUB06;

public abstract class Ente {

    protected String name;
    protected int gewicht;

    public Ente(String name, int gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    public int getFullWeight(){
        return gewicht;
    }

    public String makeNoise(){
        System.out.println("Quack, quack, quack");
        return makeNoise();
    }

}

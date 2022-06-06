package QuackUB06;

public class BadeEnte extends Ente{

    private int gewichtWasser;

    public BadeEnte(String name, int gewicht) { //dodati gewicht wasser
        super(name, gewicht);
        this.gewichtWasser = gewichtWasser;
    }

    @Override
    public int getFullWeight() {
        gewicht = gewichtWasser + gewicht;
        return super.getFullWeight();
    }

    @Override
    public String makeNoise() {
        return super.makeNoise();
    }

    @Override
    public String toString() {
        return "BadeEnte{" +
                "gewichtWasser=" + gewichtWasser +
                ", name='" + name + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }
}

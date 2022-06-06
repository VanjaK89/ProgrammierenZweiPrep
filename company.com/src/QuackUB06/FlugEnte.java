package QuackUB06;

public class FlugEnte extends Ente {
    private int gewichtFedern;

    public FlugEnte(String name, int gewicht) {
        super(name, gewicht);
        this.gewichtFedern = gewichtFedern;
    }

    @Override
    public int getFullWeight() {
        gewicht = gewichtFedern + gewicht;
        return super.getFullWeight();
    }

    @Override
    public String toString() {
        return "FlugEnte{" +
                "name='" + name + '\'' +
                ", gewicht=" + gewicht +
                ", gewichtFedern=" + gewichtFedern +
                '}';
    }


}

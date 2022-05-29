package LandUB04;

public class Bundesland extends Land{

    protected double bruttoSocialProduct;

    public Bundesland(double bruttoSocialProduct) {
        this.bruttoSocialProduct = bruttoSocialProduct;
    }

    @Override
    double getBruttoSocialProduct() {
        return bruttoSocialProduct;
    }

    @Override
    public String toString() {
        return "Bundesland{" +
                "bruttoSocialProduct=" + bruttoSocialProduct +
                '}';
    }
}

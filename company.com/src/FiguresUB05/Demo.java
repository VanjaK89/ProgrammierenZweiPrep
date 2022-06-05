package FiguresUB05;

public class Demo {
    public static void main(String[] args) {
        Figure r1 = new Rectangle(50.50, 50.50);
        Figure r2 = new Rectangle(20.50, 20.50);

        System.out.println(r1.getPerimeter());
        System.out.println(r2.getPerimeter());

        FigureManager fm = new FigureManager();
        fm.addFigures(r1);
        fm.addFigures(r2);
        System.out.println(fm.getMaxPerimeter());

        System.out.println(r1.getArea());
        System.out.println(fm.getAreaBySizeCategories());



    }
}
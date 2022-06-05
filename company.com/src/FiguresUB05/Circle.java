package FiguresUB05;

public class Circle extends Figure{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }



    @Override
    public double getPerimeter() {
        return (2 * 3.14 * radius);
    }

    @Override
    public double getArea() {
        return 3.14 *(radius * radius) ;
    }
}

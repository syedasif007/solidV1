package solid.ocp.good;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return getPi() * getSquareRadius();
    }

    private double getRadius() {
        return radius;
    }

    private double getSquareRadius() {
        return getRadius() * getRadius();
    }

    private double getPi() {
        return Math.PI;
    }
}

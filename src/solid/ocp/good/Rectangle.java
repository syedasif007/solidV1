package solid.ocp.good;

public class Rectangle implements Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    private double getWidth() {
        return this.width;
    }

    private double getHeight() {
        return this.height;
    }
}

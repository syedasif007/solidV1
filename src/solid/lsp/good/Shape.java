package solid.lsp.good;

public class Shape {

    protected double width;
    protected double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }
}

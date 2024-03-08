package solid.lsp.good;

public class Square extends Shape {

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public double getArea() {
        return super.height * super.height;
        // or
        // return super.width * super.width;
    }
}

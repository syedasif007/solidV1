package runner.good;

import shared.utils.Console;
import solid.lsp.good.Rectangle;
import solid.lsp.good.Shape;
import solid.lsp.good.Square;

public class LSP {

    public static void run() {
        Console.write("<LSP>");
        double area;

        Shape shape = new Rectangle();
        shape.setHeight(6.0);
        shape.setWidth(5.0);
        area = shape.getArea();
        Console.write("area of rectangle:" + area);

        shape = new Square();
//        shape.setHeight(6);
        shape.setWidth(5);
        area = shape.getArea();
        Console.write("area of square:" + area);
    }
}

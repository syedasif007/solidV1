package runner.bad;

import shared.utils.Console;
import solid.lsp.bad.Rectangle;
import solid.lsp.bad.Square;

public class NoLSP {

    public static void run() {
        Console.write("<No LSP>");
        double area;

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(60.5);
        rectangle.setHeight(50.5);
        area = rectangle.getArea();
        Console.write("area of rectangle:" + area);

        Square square = new Square();
        square.setWidth(50);
//        square.setHeight(40);
        area = square.getArea();
        Console.write("area of square:" + area);
    }
}

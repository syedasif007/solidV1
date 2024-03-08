package runner.good;

import shared.utils.Console;
import solid.ocp.good.Circle;
import solid.ocp.good.Rectangle;
import solid.ocp.good.Shape;

public class OCP {

    public static void run() {
        Console.write("<OCP>");
        double area = 0.0;

        Shape shape = new Rectangle(60.5, 50.5);
        area = shape.getArea();
        Console.write("area of rectangle:" + area);

        shape = new Circle(30.5);
        area = shape.getArea();
        Console.write("area of circle:" + area);
    }
}

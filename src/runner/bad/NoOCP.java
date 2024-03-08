package runner.bad;

import shared.utils.Console;
import solid.ocp.bad.Circle;
import solid.ocp.bad.Rectangle;

public class NoOCP {

    public static void run() {
        Console.write("<No OCP>");
        double area = 0.0;

        Rectangle rectangle = new Rectangle();
        area = rectangle.getArea(60.5, 50.5);
        Console.write("area of rectangle:" + area);

        Circle circle = new Circle();
        area = circle.getArea(30.5);
        Console.write("area of circle:" + area);
    }
}

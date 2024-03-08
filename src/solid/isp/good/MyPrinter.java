package solid.isp.good;

import shared.utils.Console;

public class MyPrinter implements Printer {

    @Override
    public void print() {
        Console.write("device is now printing...done!");
    }
}

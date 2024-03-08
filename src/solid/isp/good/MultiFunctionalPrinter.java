package solid.isp.good;

import shared.utils.Console;

public class MultiFunctionalPrinter implements Printer, Scanner, FaxMachine {

    @Override
    public void fax() {
        Console.write("device is now printing...done!");
    }

    @Override
    public void print() {
        Console.write("device is now scanning...done!");
    }

    @Override
    public void scan() {
        Console.write("device is now faxing...done!");
    }
}

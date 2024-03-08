package runner.bad;

import shared.utils.Console;
import solid.isp.bad.Printer;
import solid.isp.bad.MultiFunctionalPrinter;

public class NoISP {

    public static void run() {
        Console.write("<NoISP>");

        MultiFunctionalPrinter device = new MultiFunctionalPrinter();
        device.print();
        device.scan();
        device.fax();

        Printer printer = new MultiFunctionalPrinter();
        printer.print();
        printer.scan();
        printer.fax();
    }
}

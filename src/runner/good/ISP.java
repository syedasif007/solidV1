package runner.good;

import shared.utils.Console;
import solid.isp.good.*;

public class ISP {

    public static void run() {
        Console.write("<ISP>");

        Printer printer = new MyPrinter();
        printer.print();

//         printer = new Scanner();

        Scanner scanner = new MyScanner();
        scanner.scan();

//        scanner = new FaxMachine();

        FaxMachine faxMachine = new MyFaxMachine();
        faxMachine.fax();

        MultiFunctionalPrinter device = new MultiFunctionalPrinter();
        device.print();
        device.scan();
        device.fax();
    }
}

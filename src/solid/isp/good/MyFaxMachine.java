package solid.isp.good;

import shared.utils.Console;

public class MyFaxMachine implements FaxMachine {

    @Override
    public void fax() {
        Console.write("device is now faxing...done!");
    }
}

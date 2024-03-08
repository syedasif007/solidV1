package solid.isp.good;

import shared.utils.Console;

public class MyScanner implements Scanner {

    @Override
    public void scan() {
        Console.write("device is now scanning...done!");
    }
}

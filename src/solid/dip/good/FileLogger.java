package solid.dip.good;

import shared.utils.Console;

public class FileLogger implements Logger {

    @Override
    public void log(String msg) {
        Console.write(msg);
    }
}

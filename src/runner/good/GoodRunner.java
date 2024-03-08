package runner.good;

import runner.Runner;
import shared.utils.Console;

public class GoodRunner implements Runner {

    @Override
    public void run() {
        Console.write("Results from GoodRunner (SOLID):");
        SRP.run();
        OCP.run();
        LSP.run();
        ISP.run();
        DIP.run();
        Console.newLine();
    }
}

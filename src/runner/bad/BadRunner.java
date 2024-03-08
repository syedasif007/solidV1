package runner.bad;

import runner.Runner;
import shared.utils.Console;

public class BadRunner  implements Runner {

    @Override
    public void run() {
        Console.write("Results from BadRunner (No SOLID):");
        NoSRP.run();
        NoOCP.run();
        NoLSP.run();
        NoISP.run();
        NoDIP.run();
        Console.newLine();
    }
}

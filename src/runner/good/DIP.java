package runner.good;

import shared.utils.Console;
import solid.dip.good.FileLogger;
import solid.dip.good.Logger;
import solid.dip.good.UserController;

public class DIP {

    public static void run() {
        Console.write("<DIP>");

//        Logger  logger = new FileLogger();

        UserController controller = new UserController(new FileLogger());
        controller.createUser("Sam");
    }
}

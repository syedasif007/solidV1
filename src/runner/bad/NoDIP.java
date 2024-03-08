package runner.bad;

import shared.utils.Console;
import solid.dip.bad.UserController;

public class NoDIP {

    public static void run() {
        Console.write("<NoDIP>");

        UserController controller = new UserController();
        controller.createUser("Sam");
    }
}

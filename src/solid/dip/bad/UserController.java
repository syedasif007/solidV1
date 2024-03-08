package solid.dip.bad;

import shared.utils.Console;

public class UserController {

    private Logger logger = new Logger();

    public void createUser(String userName) {
        try {
            logger.log("user created, username: " + userName);
        } catch (Exception e) {
            logger.log(e.getMessage());
        }
    }
}

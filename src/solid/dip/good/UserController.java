package solid.dip.good;

public class UserController {

    private Logger logger;

    public UserController(Logger logger) {
        this.logger = logger;
    }

    public void createUser(String userName) {
        try {
            logger.log("user created, username: " + userName);
        } catch (Exception e) {
            logger.log(e.getMessage());
        }
    }
}

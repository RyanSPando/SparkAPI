package sparkdemoapi;

/**
 * Created by wjm on 29/09/15.
 */

public class Main {
    public static void main(String[] args) {
        new UserController(new UserService());
    }
}
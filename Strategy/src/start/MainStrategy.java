package start;

import auth.UserChecker;
import strategy.DBAuth;
import strategy.FileAuth;

import java.io.File;

/**
 * Created by Michael on 11/05/2016.
 */
public class MainStrategy {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        userChecker.check(new DBAuth("jdbc://etc"));
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
    }
}

package strategy;

/**
 * Created by Michael on 11/05/2016.
 */
public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}

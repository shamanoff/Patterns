package strategy;

import java.io.File;

/**
 * Created by Michael on 11/05/2016.
 */
public class FileAuth implements AuthStrategy{

    private File file;
    public FileAuth(File file){
        this.file = file;

    }


    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Checking with FILE...");
        return checkFromFile();
    }

    private boolean checkFromFile() {
        return true;
    }
}

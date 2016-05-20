import java.util.ArrayList;
import java.util.List;

public class MainMediator {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat);
        User u1 = new SimpleUser(chat);
        User u2 = new SimpleUser(chat);

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);

        u1.sendMessage("Hello!");
        admin.sendMessage("Админ зашел в чат!");
    }

    public static class TextChat implements Chat {


        User admin;
        List<User> users = new ArrayList<>();
        public void setAdmin(User admin) {
            this.admin = admin;
        }

        public void addUser(User user) {
            users.add(user);
        }


        @Override
        public void sendMessage(String message, User user) {

            for (User u : users) {
                u.getMessage(java.lang.String.valueOf(message));
            }
            admin.getMessage(java.lang.String.valueOf(message));
        }


    }

}

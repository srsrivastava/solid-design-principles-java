package example;

public class UserService {

    public void registerUser(String username, String email) {
        System.out.println("Registering user: " + username);

        saveUserToDatabase(username, email);

        sendWelcomeEmail(email);
    }

    private void saveUserToDatabase(String username, String email) {
        System.out.println("Saving user to database: " + username + ", " + email);
    }

    private void sendWelcomeEmail(String email) {
        System.out.println("Sending welcome email to: " + email);
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser("sudhanshu", "sudhanshu@example.com");
    }
}
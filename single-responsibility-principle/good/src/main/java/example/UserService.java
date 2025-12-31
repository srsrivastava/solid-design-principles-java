package example;

public class UserService {
    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserService() {
        this.emailService = new EmailService();
        this.userRepository = new UserRepository();
    }

    public void registerUser(String username, String email) {
        System.out.println("Registering user: " + username);

        userRepository.save(username, email);

        emailService.sendWelcomeEmail(email);
    }
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser("Sudhanshu", "sudhanshu@example.com");
    }
}
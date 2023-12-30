import java.util.Scanner;

public class UserInteraction {
    private UserService userService;
    private Scanner scanner;

    public UserInteraction(UserService userService) {
        this.userService = userService;
        this.scanner = new Scanner(System.in);
    }

    public void registerUser() {
        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        User user = new User(username, password);
        boolean success = userService.registerUser(user);

        if (success) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public void loginUser() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter username:");
            String username = scanner.nextLine();

            System.out.println("Enter password:");
            String password = scanner.nextLine();

            User user = new User(username, password);
            boolean success = userService.loginUser(user);

            if (success) {
                System.out.println("User logged in successfully.");
            } else {
                System.out.println("User login failed.");
            }
        } catch (Exception e) {
            // Handle the exception appropriately
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for debugging purposes
        } finally {
            scanner.close(); // Ensure that the scanner is closed, even in case of an exception
        }
    }

}
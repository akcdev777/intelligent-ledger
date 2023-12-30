import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        UserService userService = new UserService(dbConnection);
        UserInteraction userInteraction = new UserInteraction(userService);

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            try{
                System.out.println("Choose an option:");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("0. Exit");
                System.out.print("Your choice: ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        userInteraction.registerUser();
                        break;
                    case 2:
                        userInteraction.loginUser();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                        break;
                }
            } catch(InputMismatchException e){
                System.out.println("Invalid input. Please choose again.");
                scanner.next();
            }catch (Exception e) {
                // Handle other exceptions if needed
                e.printStackTrace();
            }
            
        } while (choice != 0);

        scanner.close();
    }

    //TODO: When a new user is created a portfolio for this user needs to be created as well and the user needs to be added to the portfolio table
    //TODO: When a user logs in, the user's portfolio needs to be retrieved from the database
    //TODO: When a user logs in, the user's portfolio needs to be displayed
    //TODO: Each user have only one portfolio and each portfolio belongs to only one user. Portfolio may contain none or many assets.
    //TODO: User should be able to add an asset to their portfolio
    //TODO: User should be able to remove an asset from their portfolio
    //TODO: User should be able to update an asset in their portfolio
    
}
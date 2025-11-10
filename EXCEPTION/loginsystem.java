import java.util.Scanner;

// Custom Exception Class
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

// Login Class
class Login {
    private final String validUsername = "admin";
    private final String validPassword = "12345";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUsername) || !pass.equals(validPassword)) {
            throw new InvalidCredentialsException("Invalid username or password. Please try again!");
        } else {
            System.out.println("✅ Login successful! Welcome, " + user + "!");
        }
    }
}

// Main Class
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();
        boolean success = false;

        while (!success) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            try {
                login.validate(username, password);
                success = true;
            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        sc.close();
    }
}

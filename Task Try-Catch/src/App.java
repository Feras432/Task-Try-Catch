import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String validUsername = "Coded";
        String validPassword = "Coded123";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(" Please enter the username ");
            String userName = scanner.nextLine();

            System.out.println("Please enter the password ");
            String userPassword = scanner.nextLine();

            System.out.println("The username you entered is " + userName);
            System.out.println("The password you entered is " + userPassword);

            if (userName.equals(validUsername) && userPassword.equals(validPassword)) {
                System.out.println("The username is correct");
                System.out.println("The password is correct");
            } else {
                throw new Exception("Invalid credentials");
            }

        } catch (Exception e) {
            System.out.println(" User input is invalid, please enter another Username or another Password ");

        }

        System.out.println("Thank you for using this program ");
        scanner.close();
    }

}

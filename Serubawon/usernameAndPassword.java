import java.util.Scanner;

public class usernameAndPassword {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        if (username.equals("admin")) {
            if (password.equals("1234")) {
                System.out.println("Access granted");
            } else {
                System.out.println("Access denied");
            }
        } else {
            System.out.println("Access denied");
        }
    }
}
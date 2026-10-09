import java.util.Scanner;

public class personalProfile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter year of birth: ");
        int yearOfBirth = input.nextInt();

        int age = 2025 - yearOfBirth;

        System.out.println("\nPROFILE");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Age: " + age);
    }
}
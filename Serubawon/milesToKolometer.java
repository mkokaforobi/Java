import java.util.Scanner;

public class milesToKilometer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double miles = input.nextDouble();

        double kilometres = miles * 1.60934;

        System.out.println("Miles: " + miles);
        System.out.println("Kilometres: " + kilometres);
    }
}
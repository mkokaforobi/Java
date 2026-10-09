import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter units used: ");
        int units = input.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 50;
        } else if (units <= 300) {
            bill = units * 75;
        } else {
            bill = units * 100;
        }

        System.out.println("Bill: NGN" + bill);
    }
}
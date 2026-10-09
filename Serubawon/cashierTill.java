import java.util.Scanner;

public class cashierTill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter item price: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double subtotal = price * quantity;
        double vat = subtotal * 0.20;
        double grandTotal = subtotal + vat;

        System.out.println("Grand Total: " + grandTotal);
    }
}
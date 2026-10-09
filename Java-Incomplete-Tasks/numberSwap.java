import java.util.Scanner;

public class numberSwap {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
        	System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();

        	int temporary = firstNumber;
        	firstNumber = secondNumber;
        	secondNumber = temporary;

        	System.out.println("\nThe first number is: " + firstNumber);
        	System.out.println("he second number is: " + secondNumber);
	}
}
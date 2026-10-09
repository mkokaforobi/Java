import java.util.Scanner;

public class IntegerSwap {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number  ");
		int numberOne = input.nextInt();

		System.out.print("Enter the second number  ");
		int numberTwo = input.nextInt();

		System.out.println("\nThe first number is " + numberOne);
		System.out.println("The second number is " + numberTwo);

		numberOne = numberTwo + numberOne;
		numberTwo = numberOne - numberTwo;
		numberOne = numberOne - numberTwo;

		System.out.println("\nThe first number is " + numberOne);
		System.out.println("The second number is " + numberTwo);





	}
}
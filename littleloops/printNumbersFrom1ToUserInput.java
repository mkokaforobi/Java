import java.util.Scanner;

public class printNumbersFrom1ToUserInput {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);	

			System.out.print("Enter a number: ");

			int userInput = input.nextInt();	

			for(int number = 1; number <= userInput; number++){


			System.out.println(number);

			}


	}


}
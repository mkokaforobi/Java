import java.util.Scanner;

public class printNumbersFromNDownTo1 {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);	

			System.out.print("Enter a number: ");

			int userInput = input.nextInt();	

			for(int number = userInput; number >= 1; number--){


			System.out.println(number);

			}


	}


}
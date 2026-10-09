import java.util.Scanner;

public class sumOfFirstNNumber {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);	

			System.out.print("Enter a number: ");

			int userInput = input.nextInt();

			int sum = 0;	

			for(int number = 1; number <= userInput; number++){

			sum += number;
		

			}

			System.out.println(sum);
	
	}


}
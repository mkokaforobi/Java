import java.util.Scanner;

public class Happiness{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int numberOne = input.nextInt();

	System.out.print("Enter a number: ");
	int numberTwo = input.nextInt();

	System.out.println(number(numberOne, numberTwo));

	}
	public static int number(int numberOne, int numberTwo){

		int score = (numberOne + numberTwo) / 2;


			if (score > 76.2){
				System.out.println("Proficient!");
			}
			else if(score == 50 && score == 76.2){
				System.out.println("You are getting there " + score);
			}

			else{
				System.out.println("Get Better " + score);
			}

		
	
}
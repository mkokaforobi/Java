public class Kata {

	public static void main(String ...args){}

	public static int maximum(int firstNumber, int secondNumber) {

		if(firstNumber > secondNumber) {
		return firstNumber;

		} else {
		return secondNumber;

		}

	
	}	
	
	public static boolean isEven(int number) {

		if(number % 2 == 0){
		return true;

		} else {
		return false;
		}		
	
	}	
	

	public static boolean isPrimeNumber(int number) {

		int factor = 0;

		if(number < 2) {
			return false;
		}
		for (int count = 1; count <= number; count++) {
			if(number % count == 0) {
				factor++;
			}
		
		}
		return factor == 2;
	}	


	public static int subtract(int firstNumber, int secondNumber ) {

		if(firstNumber > secondNumber){
		return firstNumber - secondNumber;

		} else {
		return secondNumber - firstNumber;
		}		
	
	}	

	public static float divide(int firstNumber, int secondNumber ) {

		if(secondNumber == 0) {
		return 0;
		}

		return (float) firstNumber / secondNumber;
	
	}
				
	public static int factorOf(int number) {

		int count = 0;

		for(int inputNumber = 1; inputNumber <= number; inputNumber++ ) {
		
			if(number % inputNumber == 0) {
				count++;

			}
		}

		return count;
	
	}
		

	public static boolean isPerfectSquare(int number) {

		if (number < 0) {
			return false;
		}
		
		int squareRoot = (int) Math.sqrt(number);
		
		return squareRoot * squareRoot == number;


	
	}

	public static boolean isPalindrome(int number) {

		int firstNumber = number / 10000;
		int secondNumber = (number / 1000) % 10;
		int fourthNumber = (number / 10) % 10;
		int fifthNumber = number % 10;

		return firstNumber == fifthNumber && secondNumber == fourthNumber;
	
	}

	public static long factorialOf(int number) {

		long factorial = 1;

		for (int inputNumber = 1;  inputNumber <= number; inputNumber++) {
		
			factorial = factorial * inputNumber;

		}
		

		return factorial;
	
	}

	public static long squareOf(int number) {
		
		return (long) number * number;

	}
	






	




}


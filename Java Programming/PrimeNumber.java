import java.util.Scanner;
	public class PrimeNumber{
	public static void main(String[] args) {

Scanner input = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int number = input.nextInt();

 
boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }

        
    }
}




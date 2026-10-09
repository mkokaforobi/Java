import java.util.Scanner;

    public class Multiples {
        public static void main(String[] args)  {

  Scanner input = new Scanner(System.in);

	System.out.print("Enter the first number ");

  	int firstNumber = input.nextInt();

	
System.out.print("Enter the second number ");

int secondNumber = input.nextInt();


  if (firstNumber * 3 == secondNumber * 2)
    System.out.println("True");

  if (firstNumber * 3 != secondNumber * 2)
    System.out.println("False");


  }
}
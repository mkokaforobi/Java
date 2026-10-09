import java.util.Scanner;

public class arrayTask{

	public static void main(String [] args){

		Scanner inputCollector = new Scanner(System.in);
		
		int number[] = new int[5];

		for(int count = 0; count < 5; count++){

		System.out.print("Enter number: ");
		number[count] = inputCollector.nextInt();
		}


		for(int count = 0; count < 5; count++){

		System.out.println(number[count]);
		}

		int largestNumber = number[0];
		int smallestNumber = number[0];	

	
	
		for(int count =1; count <5 ; count++) {
		if (smallestNumber > number[count]){

		smallestNumber = number[count];

        	}
	}

	for(int count =1; count <5 ; count++) {
		if (largestNumber < number[count]){

		largestNumber = number[count];

		}
	}
	

	System.out.println("Largest: " + largestNumber);
        System.out.println("Smallest: " + smallestNumber);	

	double average = 0.0;
	int sum = 0;

	for(int count =0; count < 5; count++){

		sum += number[count];
	}

	average = sum / number.length;

	System.out.println("The average is " +average);
		



	} 

}
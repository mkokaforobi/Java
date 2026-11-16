import java.util.Scanner;

public class returnNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		while (number > 9 || number < -9) {
			int total = 0;
			int temporaryNumber = number;
			boolean isNegative = false;

         
			if (temporaryNumber < 0) {
				isNegative = true;
				temporaryNumber = -temporaryNumber;
			}

     
			while (temporaryNumber > 0) {
				int digit = temporaryNumber % 10;
				temporaryNumber = temporaryNumber / 10;

              	
				if (temporaryNumber == 0 && isNegative) {
					total = total - digit;
				} else {
					total = total + digit;
               			}
          	
			}
	
            		number = total;
		}

        	System.out.println(number);

	}


}
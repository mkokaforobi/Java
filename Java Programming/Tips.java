import java.util.Scanner;

	public class CalculateTips{

	public static void main(String[] args) {

 
Scanner input = new Scanner(System.in);

System.out.print("Enter the subtotal and a gratuity rate: ");


	 double subtotal = input.nextdouble();
	 double rate = input.nextdouble();

 double gratuity = subtotal * (rate / 100);
 double total = subtotal + gratuity;

System.out.println("The gratuity is " + gratuity); 

System.out.println("The total is " + total);



	}

}



import java.util.Scanner;

public class Divisible{
    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
 
    
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    if (number % 3 == 0)
    System.out.println("Divisible by 3");

    if (number % 3 != 0)
    System.out.println("Not divisible by 3");

    }

 }
/write a function that takes in array of any length and returns the even numbers in the array

//PC
//declare the class
//decalre the public static ..
I/declare the static method and assign nothing since it should take in any length //declare the function
use a Loop to count the variables in the array
/use an if statement to check the numbers in the array are divisible by 2(%)
//return the even numbers



import java.util.Arrays;

public class ChibuzorJavaPractice {

	public static void main(String... args) {
        	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        	int[] evens =isEvens(numbers);
        	System.out.println(Arrays.toString(evens)); // [2, 4, 6, 8]
    }

    public static int[] isEvens(int[] numbers) {
        int count = 0;
        for (int indexCounter = 0; indexCounter < numbers.length; indexCounter++) {
            if (numbers[indexCounter] % 2 == 0) {
                count++;
            }
        }

        int[] result = new int[count];

        int position = 0;
        for (int indexCounter = 0; indexCounter < numbers.length; indexCounter++) {
            if (numbers[indexCounter] % 2 == 0) {
                result[position] = numbers[indexCounter];
                position++;
            }
        }

        return result;
    }
}
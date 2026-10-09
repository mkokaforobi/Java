public class ChibuzorJavaPractice {

	public static void main(String... args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        IsEven(numbers);
    }

	public static int[] IsEven(int[] numbers) {

		int[] ArrayTest = new int [numbers.length];

		int count = 0;

        	for (int indexCounter = 0; indexCounter < numbers.length; indexCounter++) {

           		 if (numbers[indexCounter] % 2 == 0) { 

			ArrayTest[numbers.length] = numbers[indexCounter];
	
			
            		}
  

		}

		return ArrayTest;

    	}



}

	

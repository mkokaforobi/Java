public class whileLoopForProductOfIntergersFrom1And10 {

	public static void main(String... args){
        	
		int number = 1;
        	int product = 1;

        	while (number <= 10) {

           	product = product * number;

           	System.out.println(number + " -> " + product);

            	number++;
        	}

        	System.out.println("Final product = " + product);
    
	}

}
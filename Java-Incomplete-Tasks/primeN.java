
public class PrimeNumber{
	public static void main(String[] args) {
 
boolean isPrime = true;

        if (int number =1; number <=100; number++) {
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
            System.out.println(number);
        } 
        
    }
}


public class PrimeNumber {
    public static void main(String[] args) {
        for (int dividend = 1; dividend <= 100; dividend++) {
            if (dividend == 1) {
                continue; 
            }

            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(dividend); divisor++) {
                if (dividend % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(dividend);
            }
        }
    }
}
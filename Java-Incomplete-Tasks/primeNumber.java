public class PrimeNumber {
    public static void main(String[] args) {
        for (int dividend = 2; dividend <= 100; dividend++) {
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
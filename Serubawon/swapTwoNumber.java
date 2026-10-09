public class swapTwoNumber {
    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;

        System.out.println("Before swap:");
        System.out.println("First: " + firstNumber);
        System.out.println("Second: " + secondNumber);

        int temporary = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temporary;

        System.out.println("After swap:");
        System.out.println("First: " + firstNumber);
        System.out.println("Second: " + secondNumber);
    }
}
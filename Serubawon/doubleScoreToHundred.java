import java.util.Scanner;

public class doubleScoreToHundred {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter score out of 50: ");
        double score = input.nextDouble();

        double scaledScore = score * 2;

        System.out.println("Original score: " + score);
        System.out.println("Scaled score: " + scaledScore);
    }
}
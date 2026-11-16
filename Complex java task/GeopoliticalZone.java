
import java.util.Scanner;

public class GeopoliticalZone {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a state:");
        String state = input.nextLine();

        if (state.equalsIgnoreCase("Lagos") || state.equalsIgnoreCase("Ogun") ||
            state.equalsIgnoreCase("Oyo") || state.equalsIgnoreCase("Osun") ||
            state.equalsIgnoreCase("Ondo") || state.equalsIgnoreCase("Ekiti")) {

            System.out.println("South West");

        } else if (state.equalsIgnoreCase("Abia") || state.equalsIgnoreCase("Anambra") ||
                   state.equalsIgnoreCase("Imo") || state.equalsIgnoreCase("Enugu") ||
                   state.equalsIgnoreCase("Ebonyi")) {

            System.out.println("South East");

        } else if (state.equalsIgnoreCase("Rivers") ||
                   state.equalsIgnoreCase("Delta") || state.equalsIgnoreCase("Edo") ||
                   state.equalsIgnoreCase("Bayelsa") || state.equalsIgnoreCase("Akwa-Ibom") ||
                   state.equalsIgnoreCase("Cross-River")) {

            System.out.println("South South");

        } else if (state.equalsIgnoreCase("Benue") ||
                   state.equalsIgnoreCase("Kogi") || state.equalsIgnoreCase("Kwara") ||
                   state.equalsIgnoreCase("Niger") || state.equalsIgnoreCase("Plateau") ||
                   state.equalsIgnoreCase("Nasarawa") || state.equalsIgnoreCase("FCT")) {

            System.out.println("North Central");

        } else if (state.equalsIgnoreCase("Adamawa") ||
                   state.equalsIgnoreCase("Bauchi") || state.equalsIgnoreCase("Borno") ||
                   state.equalsIgnoreCase("Gombe") || state.equalsIgnoreCase("Taraba") ||
                   state.equalsIgnoreCase("Yobe")) {

            System.out.println("North East");

        } else if (state.equalsIgnoreCase("Kano") ||
                   state.equalsIgnoreCase("Kaduna") || state.equalsIgnoreCase("Katsina") ||
                   state.equalsIgnoreCase("Kebbi") || state.equalsIgnoreCase("Sokoto") ||
                   state.equalsIgnoreCase("Jigawa") || state.equalsIgnoreCase("Zamfara")) {

            System.out.println("North West");

        } else {

            System.out.println("Invalid state");

        }

        
    }
}

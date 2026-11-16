
import java.util.Scanner;

enum Zone {
    NORTH_CENTRAL,
    NORTH_EAST,
    NORTH_WEST,
    SOUTH_EAST,
    SOUTH_SOUTH,
    SOUTH_WEST
}

public class GeopoliticalZone {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Nigerian state:");
        String state = input.nextLine().toUpperCase();

        Zone zone = null;

        switch (state) {

            case "LAGOS":
            case "OGUN":
            case "OYO":
            case "OSUN":
            case "ONDO":
            case "EKITI":
                zone = Zone.SOUTH_WEST;
                break;

            case "ABIA":
            case "ANAMBRA":
            case "IMO":
            case "ENUGU":
            case "EBONYI":
                zone = Zone.SOUTH_EAST;
                break;

            case "RIVERS":
            case "DELTA":
            case "EDO":
            case "BAYELSA":
            case "AKWA IBOM":
            case "CROSS RIVER":
                zone = Zone.SOUTH_SOUTH;
                break;

            case "BENUE":
            case "KOGI":
            case "KWARA":
            case "NIGER":
            case "PLATEAU":
            case "NASARAWA":
            case "FCT":
                zone = Zone.NORTH_CENTRAL;
                break;

            case "ADAMAWA":
            case "BAUCHI":
            case "BORNO":
            case "GOMBE":
            case "TARABA":
            case "YOBE":
                zone = Zone.NORTH_EAST;
                break;

            case "KANO":
            case "KADUNA":
            case "KATSINA":
            case "KEBBI":
            case "SOKOTO":
            case "JIGAWA":
            case "ZAMFARA":
                zone = Zone.NORTH_WEST;
                break;

            default:
                System.out.println("Invalid state");
        }

        if (zone != null) {
            System.out.println(state + " belongs to " + zone);
        }

        
    }
}

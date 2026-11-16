
import java.util.Scanner;


public static void main(String...args) {

    Scanner input = new Scanner(System.in);
    TV tv = new TV();

    int choice;

    do {
        System.out.println("\nTELEVISION");
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. Change Channel");
        System.out.println("4. Increase Volume");
        System.out.println("5. Decrease Volume");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");

        choice = input.nextInt();

        switch (choice) {
            case 1:
                tv.turnOn();
                break;

            case 2:
                tv.turnOff();
                break;

            case 3:
                System.out.print("Enter channel number: ");
                int newChannel = input.nextInt();
                tv.changeChannel(newChannel);
                break;

            case 4:
                tv.increaseVolume();
                break;

            case 5:
                tv.decreaseVolume();
                break;

            case 0:
                System.out.println("Television closed");
                break;

            default:
                System.out.println("Invalid choice");
        }

    } while (choice != 0);

 
}




public class TV {


    boolean isOn = false;
    int channel = 1;
    int volume = 10;

    public void turnOn() {
        isOn = true;
        System.out.println("TV is now ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("TV is now OFF");
    }

    public void changeChannel(int newChannel) {
        if (isOn && newChannel > 0) {
            channel = newChannel;
            System.out.println("Current channel: " + channel);
        } else {
            System.out.println("Turn on the TV and enter a valid channel");
        }
    }

    public void increaseVolume() {
        if (isOn && volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("TV is off or volume is at maximum");
        }
    }

    public void decreaseVolume() {
        if (isOn && volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("TV is off or volume is at minimum");
        }
    }
}

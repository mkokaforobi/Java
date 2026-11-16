

public class Bike {


    static boolean bikeIsOn = false;
    static int speed = 0;
    static int gear = 1;




    static void turnOn() {
        bikeIsOn = true;
    }

   
    static void turnOff() {
        bikeIsOn = false;
    }


    static int getGearForSpeed(int someSpeed) {
        if (someSpeed <= 20) {
            return 1;       
        } else if (someSpeed <= 30) {
            return 2;       
        } else if (someSpeed <= 40) {
            return 3;       
        } else {
            return 4;      
        }
    }

    
    static void updateGear() {
        gear = getGearForSpeed(speed);
    }

   
    static void accelerate() {
               if (!bikeIsOn) {
            return;
        }
       
        speed = speed + gear;
       
        updateGear();
    }

   
    static void decelerate() {
       
        if (!bikeIsOn) {
            return;
        }
       
        speed = speed - gear;
       
        if (speed < 0) {
            speed = 0;
        }
       
        updateGear();
    }

   
    static void setUpBike(int startingSpeed) {
        bikeIsOn = true;
        speed = startingSpeed;
        updateGear();      
    }

   

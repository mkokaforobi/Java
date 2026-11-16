import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

   @Test
    public void testThatBikeIsOffWhenCreated(){
       Bike bike = new Bike();
       assertFalse(bike.getPower());
   }

   @Test
    public void testThatBikeCanBeSwitchOnWhenOff(){
       Bike bike = new Bike();
       assertFalse(bike.getPower());

       bike.turnOn();
       assertTrue(bike.getPower());
   }

   @Test
    public void testThatBikeCanBePutOffWhenOn(){
       Bike bike = new Bike();
       assertFalse(bike.getPower());

       bike.turnOn();
       assertTrue(bike.getPower());

       bike.turnOff();
       assertFalse(bike.getPower());
   }

   @Test
    public void testThatBikeInitialSpeedWhenCreatedIs_zero(){
       Bike bike = new Bike();
       assertFalse(bike.getPower());

       bike.turnOn();
       assertTrue(bike.getPower());

       assertEquals(0, bike.getSpeed());
   }

   @Test
    public void testThatBikeInitialGearWhenCreatedIs_one(){
       Bike bike = new Bike();
       assertFalse(bike.getPower());

       bike.turnOn();
       assertTrue(bike.getPower());

       assertEquals(1, bike.getGear());
   }

   @Test
    public void testThatBikeCanAccelerateWhileAtGearOne_byOne(){
       Bike bike = new Bike();
       assertFalse(bike.getPower());

       bike.turnOn();
       assertTrue(bike.getPower());

       bike.accelerate();
       bike.accelerate();
       assertEquals(2, bike.getSpeed());
   }

   @Test
   public void testThatBikeCanAccelerateWhileAtGearTwo_byTwo(){
       Bike bike = new Bike();
       assertFalse(bike.getPower());

       bike.turnOn();
       assertTrue(bike.getPower());

       assertEquals(1, bike.getGear());

       bike.updateGear();
       assertEquals(2, bike.getGear());

       assertEquals(0, bike.getSpeed());

       bike.accelerate();
       bike.accelerate();
       assertEquals(4, bike.getSpeed());
   }
}
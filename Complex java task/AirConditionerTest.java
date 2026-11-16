import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    @Test
    public void testThatAC_IsoOffWhenCreated(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getPower());
    }

    @Test
    public void testThatAC_canBePutOnWhenCreated(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getPower());

        airConditioner.turnOn();
        assertTrue(airConditioner.getPower());
    }

    @Test
    public void testThatAc_canBePoweredOffWhenOn(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getPower());

        airConditioner.turnOn();
        assertTrue(airConditioner.getPower());

        airConditioner.turnOff();
        assertFalse(airConditioner.getPower());
    }

    @Test
    public void testThatAC_initialTemperatureIS_24_whenIsSwitchOff(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getPower());

        airConditioner.turnOn();
        assertTrue(airConditioner.getPower());

        assertEquals(24, airConditioner.getTemperature());
    }

    @Test
    public void testThatTemperatureCanIncreaseFromItInitialTemperatureTo_25_whenIncreaseByOne(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getPower());

        airConditioner.turnOn();
        assertTrue(airConditioner.getPower());

        assertEquals(24, airConditioner.getTemperature());

        airConditioner.increaseTemperature();
        assertEquals(25, airConditioner.getTemperature());
    }

    @Test
    public void testThatAC_temperatureReturnsZeroWhenAcIsOff(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getPower());

        assertEquals(0, airConditioner.getTemperature());
    }

    @Test
    public void testThatWhenAc_isIncreased_10_timesFrom_24_doesNotMoveOver_30(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getPower());

        airConditioner.turnOn();
        assertTrue(airConditioner.getPower());

        assertEquals(24, airConditioner.getTemperature());

        for(int index =0; index < 10; index++)airConditioner.increaseTemperature();

        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void testThatTemperatureCanDecreaseFromItInitialTemperature_24_To_23_whenDecreaseByOne(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getPower());

        airConditioner.turnOn();
        assertTrue(airConditioner.getPower());

        assertEquals(24, airConditioner.getTemperature());

        airConditioner.decreaseTemperature();
        assertEquals(23, airConditioner.getTemperature());
    }

    @Test
    public void testThatWhenAc_isDecreases_10_timesFrom_24_doesNotMoveLowerThan_16(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getPower());

        airConditioner.turnOn();
        assertTrue(airConditioner.getPower());

        assertEquals(24, airConditioner.getTemperature());

        for(int index =0; index <20; index++)airConditioner.decreaseTemperature();

        assertEquals(16,airConditioner.getTemperature());
    }

}
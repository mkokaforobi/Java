public class AirConditioner {


    private boolean acIsOn;
    private int temperature = 24;


    public void turnOn() {
        acIsOn = true;
    }


    public void turnOff() {
        acIsOn = false;
    }


    public void increaseTemperature() {

        int MAXIMUM_TEMPERATURE = 30;
        if (temperature < MAXIMUM_TEMPERATURE) {

            temperature = temperature + 1;
        }

    }


    public void decreaseTemperature() {

        int MINIMUM_TEMPERATURE = 16;
        if (temperature > MINIMUM_TEMPERATURE) {

            temperature = temperature - 1;
        }

    }


    public boolean getPower() {
        return acIsOn;
    }

    public int getTemperature() {
        if(acIsOn)return temperature;
        return 0;
    }
}
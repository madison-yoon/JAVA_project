package 자동차만들기;

public class Bus extends CarType {

    public Bus(int passenger, int location, double weather) {
        super(150, 5.0, 100, passenger, 20, "동양고속", location, weather);
    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            this.fuelTankSize = (int) (this.fuelTankSize + 30);
        }
    }
}
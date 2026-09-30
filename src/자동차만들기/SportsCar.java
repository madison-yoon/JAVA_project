package 자동차만들기;

public class SportsCar extends CarType {

    public SportsCar(int passenger, int location, double weather) {
        super(250, 8.0, 30, passenger, 2, "488 Spider", location, weather);
    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            this.speed = (int) (this.speed * 1.2);
        }
    }
}
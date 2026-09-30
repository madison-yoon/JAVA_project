package 자동차만들기;

public class Sedan extends CarType {

    public Sedan(int passenger, int location, double weather) {
        super(200, 12.0, 45, passenger, 4, "플라잉스퍼", location, weather);
    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            this.seatCount = (int) (this.seatCount + 1);
        }
    }
}

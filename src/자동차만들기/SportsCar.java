package 자동차만들기;

public class SportsCar extends CarType implements ISMode {

    public SportsCar(int passenger, int location, double weather) {
        super(250, 8.0, 30, passenger, 2, "488 Spider", location, weather);
    }

    @Override
    public void setTurbo() {
        this.speed = (int) (this.speed * 1.2);
    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            setTurbo();
        }
    }

    @Override
    public void AirConON() {
        System.out.println("A/C를 동작합니다.");
        this.fuelEfficiency = this.fuelEfficiency * 0.95;

    }

    @Override
    public void AirConOFF() {
        System.out.println("A/C를 종료합니다.");
    }

    @Override
    public void AudioON() {
        System.out.println("Audio를 동작합니다.");
    }

    @Override
    public void AudioOFF() {
        System.out.println("Audio를 종료합니다.");
    }

    @Override
    public void AutoDriveON() {

    }

    @Override
    public void AutoDriveOFF() {

    }

    @Override
    public void addFuelTank() {

    }

    @Override
    public void addSeat() {

    }
}



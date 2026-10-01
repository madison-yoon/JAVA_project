package 자동차만들기;

public class Sedan extends CarType implements ISMode{

    public Sedan(int passenger, int location, double weather) {
        super(200, 12.0, 45, passenger, 4, "플라잉스퍼", location, weather);
    }

    @Override
    public void addSeat() {
        this.seatCount = (int) (this.seatCount + 1);
    }

    @Override
    public void setTurbo() {

    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            addSeat();
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
        System.out.println("AutoDrive를 동작합니다.");
        this.speed = (int) (this.speed * 0.9);
    }

    @Override
    public void AutoDriveOFF() {
        System.out.println("AutoDrive를 종료합니다.");
    }

    @Override
    public void addFuelTank() {

    }


}

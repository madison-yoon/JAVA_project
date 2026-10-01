package 자동차만들기;

public class Bus extends CarType implements ISMode{

    public Bus(int passenger, int location, double weather) {
        super(150, 5.0, 100, passenger, 20, "동양고속", location, weather);
    }
    @Override
    public void addFuelTank() {
        this.fuelTankSize = (int) (this.fuelTankSize + 30);
    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            addFuelTank();
        }
    }

    @Override
    public void addSeat() {
    }

    @Override
    public void setTurbo() {
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
    }

    @Override
    public void AudioOFF() {
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


}
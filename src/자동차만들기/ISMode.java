package 자동차만들기;

public interface ISMode {
    void setMode(boolean isOn);

    void AirConON();
    void AirConOFF();
    void AudioON();
    void AudioOFF();
    void AutoDriveON();
    void AutoDriveOFF();
    void addFuelTank();
    void addSeat();
    void setTurbo();
}

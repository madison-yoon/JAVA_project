package 자동차만들기;

abstract class CarType {
    protected int speed;
    protected double fuelEfficiency;
    protected int fuelTankSize;
    protected int passenger;
    protected int seatCount;
    protected String carName;
    protected int location;
    protected double weather;

    public CarType(int speed, double fuelEfficiency, int fuelTankSize, int passenger, int seatCount, String carName, int location, double weather) {
        this.speed = speed;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelTankSize = fuelTankSize;
        this.passenger = passenger;
        this.seatCount = seatCount;
        this.carName = carName;
        this.location = location;
        this.weather = weather;
    }

    public void setMode(boolean isOn) {
    }

    public int TripCount() {
        return (int) Math.ceil((double) passenger / seatCount);
    }

    public double Distance() {
        return (double) location * TripCount();
    }

    public double FuelConsumption() {
        return Distance() / fuelEfficiency;
    }

    public int RefuelingCount() {
        return (int) Math.ceil(FuelConsumption() / fuelTankSize);
    }

    public int Cost() {
        return (int) (FuelConsumption() * 2000);
    }

    public String TravelTime() {
        double totalHours = ((double) location / speed) * TripCount() * weather;
        int hours = (int) totalHours;
        int minutes = (int) Math.round((totalHours - hours) * 60);

        return hours + "시간 " + minutes + "분";
    }

}
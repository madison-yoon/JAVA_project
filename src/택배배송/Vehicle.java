package 택배배송;

public class Vehicle {
    public void send() {
        System.out.println("배송을 시작합니다..");
    }
}

class ParcelDelivery extends 택배배송.Vehicle {
    @Override
    public void send() {
        System.out.println("택배 배송을 시작합니다. 2~3일 소요됩니다.");
    }
}

class QuickDelivery extends 택배배송.Vehicle {
    @Override
    public void send() {
        System.out.println("퀵 배송을 시작합니다. 당일 도착 예정입니다.");
    }
}

class AirDelivery extends 택배배송.Vehicle {
    @Override
    public void send(){
        System.out.println("항공 배송을 시작합니다. 해외로 출발합니다");
    }
}
package 객체지향기본;

public class OOPBasic {
    public static void main(String[] args) {

        // 1. 매개변수가 있는 생성자로 Television을 만들고 동작해보기
        // (boolean isOn, int channel, int volume, String brand)
        Television tv1 = new Television(true, 10, 30, "삼성");
        tv1.printTV();

        System.out.println("-------------------");

        // 2. 매개변수가 없는 생성자로 Television을 만들고 동작해보기
        // (브랜드 설정이 안되므로 브랜드 설정에 대한 세터 메서드 필요)
        Television tv2 = new Television();
        tv2.brand = "샤오미"; // 또는 별도의 세터 메서드를 활용하거나 직접 필드에 대입
        tv2.setPower(true);
        tv2.setChannel(1500,true);
        tv2.setVolume(40);
        tv2.printTV();
    }
}
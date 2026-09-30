package 추상클래스;

public class ApplePhone extends Phone{

    public ApplePhone(String name) {
        super(name);
    }

    @Override
    void call() {
        System.out.println("iPhone에 에 전화가 왔습니다.");
    }
    void store() {
        System.out.println("App Store을 호출합니다. ");
    }
}

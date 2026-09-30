package 추상클래스;

public class AndroidPhone extends Phone {
    public AndroidPhone(String name) {
        super(name); // 부모의 생성자 호출, 자식 클래스의 생성자 호출 시 부모 생성자를 먼저 불러줘야함
    }

    @Override
    void call() {
        System.out.println("안드로이드 폰에 전화가 왔습니다.");
    }
    void store() {
        System.out.println("Play Store를 호출합니다.");
    }
}

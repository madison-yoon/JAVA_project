package 추상클래스;

public class abstractMain {
    public static void main(String[] args) {
        Phone phone = new AndroidPhone("갤럭시 S25");
        phone.call();
        phone.store();

        Phone phone1 = new ApplePhone("iPhone 14");
        phone1.call();
        phone1.store();

    }
}

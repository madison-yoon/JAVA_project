package 택배배송;


import java.util.Scanner;

public class ParceleMain {
    public static void main(String[] args) {
        Delivery Delivery = new Delivery("쿠팡");
        Scanner sc = new Scanner(System.in);
        System.out.println("[1]택배 [2]퀵 [3]에어");
        System.out.print("배송 시스템 선택: ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                Delivery.send(new ParcelDelivery());
                break;
            case 2:
                Delivery.send(new QuickDelivery());
                break;
            case 3:
                Delivery.send(new AirDelivery());
                break;
            default:
                System.out.println("배송 시스템 선택이 잘못되었습니다.");
        }
    }
}

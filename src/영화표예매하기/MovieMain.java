package 영화표예매하기;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        MovieTicket ticket =  new MovieTicket(10000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===영화표 예매 시스템===");
            System.out.println("[1] 예매하기");
            System.out.println("[2] 취소하기");
            System.out.println("[3] 종료하기");
            System.out.println("메뉴 선택: ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    ticket.selectSeat();
                    break;
                case 2:
                    ticket.cancelSeat();
                    break;
                case 3:
                    System.out.println("총 판매 금액: " + ticket.getTotalPrice());
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로그램을 정상 종료시킵니다.
                    break;
                default:
                    System.out.println("메뉴 선택이 잘못되었습니다.");
            }
        }
    }
}

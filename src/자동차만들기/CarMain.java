package 자동차만들기;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int carChoice = 0;
        int destChoice = 0;
        int weatherChoice = 0;
        int passenger = 0;
        int optionChoice = 0;

        int location = 0;
        double weather = 1.0;
        boolean isModeOn = false;

        while (true) {
            System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            destChoice = sc.nextInt();

            switch (destChoice) {
                case 1: location = 400; break;
                case 2: location = 150; break;
                case 3: location = 200; break;
                case 4: location = 300; break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.\n");
                    continue;
            }
            break;
        }

        while (true) {
            System.out.print("이동할 승객 수 입력 : ");
            passenger = sc.nextInt();

            if (passenger <= 0) {
                System.out.println("승객 수는 1명 이상이어야 합니다.\n");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            carChoice = sc.nextInt();

            if (carChoice >= 1 && carChoice <= 3) {
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 선택해주세요.\n");
        }

        while (true) {
            System.out.print("부가 기능 [1]ON [2]OFF : ");
            optionChoice = sc.nextInt();

            if (optionChoice == 1) {
                isModeOn = true;
                break;
            } else if (optionChoice == 2) {
                isModeOn = false;
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 선택해주세요.\n");
        }

        while (true) {
            System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
            weatherChoice = sc.nextInt();

            switch (weatherChoice) {
                case 1: weather = 1.0; break;
                case 2: weather = 1.2; break;
                case 3: weather = 1.4; break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.\n");
                    continue;
            }
            break;
        }

        CarType carType = null;
        switch (carChoice) {
            case 1:
                carType = new SportsCar(passenger, location, weather);
                break;
            case 2:
                carType = new Sedan(passenger, location, weather);
                break;
            case 3:
                carType = new Bus(passenger, location, weather);
                break;
        }

        carType.setMode(isModeOn);

        System.out.println("\n=======" + carType.carName + "=======");
        System.out.println("총 비용 : " + String.format("%,d", carType.Cost()) + "원");
        System.out.println("총 주유 횟수 : " + carType.RefuelingCount() + "회");
        System.out.println("총 이동 시간 : " + carType.TravelTime());

        sc.close();
    }
}
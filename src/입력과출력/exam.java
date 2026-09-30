package 입력과출력;

import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        // --- 1번 문제: 자기소개 출력 ---
//        String name = "곰돌이";
//        int age = 25;
//        String hobby = "코딩, 독서, 운동";
//        String intro = "\"안녕하세요, 잘 부탁드립니다.\"";
//
//        System.out.println("=".repeat(32));
//        System.out.println("=".repeat(32));
//        System.out.println("이름  : " + name);
//        System.out.println("나이  : " + age + '세');
//        System.out.println("취미  : " + hobby);
//        System.out.println("한마디  : " + intro);
//        System.out.println("=".repeat(32));
//
//        // 구분을 위한 빈 줄
//        System.out.println();
//
//        // --- 2번 문제: 카페 영수증 출력 ---
//        System.out.println("=".repeat(30));
//        System.out.println("       JAVA CAFE 영수증");
//        System.out.println("=".repeat(30));
//
//        System.out.printf("%-10s %3s %7s\n", "아메리카노", "2잔", String.format("%,d원", 9000));
//        System.out.printf("%-10s %3s %7s\n", "카페라떼", "1잔", String.format("%,d원", 5500));
//        System.out.printf("%-10s %3s %7s\n", "치즈케이크", "1조각", String.format("%,d원", 6800));
//
//        System.out.println("-".repeat(30));
//        System.out.printf("%-10s %10s\n", "합  계", String.format("%,d원", 21300));
//        System.out.println("=".repeat(30));
//        System.out.println("감사합니다. 또 방문해주세요!");
//
//        // 구분을 위한 빈 줄
//        System.out.println();
//
//        // --- 3번 문제: 구구단 3단 출력 ---
//        System.out.println("─".repeat(21));
//        System.out.println("     구구단  3단       ");
//        System.out.println("─".repeat(21));
//
//        int dan = 3;
//        for (int i = 1; i <= 9; i++) {
//            System.out.printf("%d x %d = %2d\n", dan, i, (dan * i));
//        }

        // 표준 입력은 스캐너 객체 사용
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        // 이름, 주소, 성별, 나이, 이메일을 입력 받아 출력하기
        System.out.print("이름 입력: "); // 쥴바꿈이 없음
        String name = sc.nextLine(); // 문자열을 공백 기준으로 입력 받음
        System.out.print("주소 입력: "); // 쥴바꿈이 없음
        String addr = sc.nextLine(); // 문자열을 줄바꿈 기준으로 입력 받음
        System.out.print("성별 입력: "); // 쥴바꿈이 없음
        char gender = sc.next().charAt(0); // 문자열에서 해당 인덱스의 문자를 추출
        System.out.print("나이 입력: "); // 쥴바꿈이 없음
        int age = sc.nextInt(); // 정수 입력
        System.out.print("이메일 입력: "); // 쥴바꿈이 없음
        String email = sc.next(); // 문자열 입력

        // 출력 해보기, 단 성별은 "남성", "여성"으로 출력
        System.out.println("==== 회원 정보 출력 ====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + (gender == 'M' ? "남성" : "여성"));
        System.out.println("나이 : " + age);
        System.out.println("이메일: " + email);

    }
}
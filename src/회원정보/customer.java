package 회원정보;

// 내가 만든 코드

import java.util.Scanner;

public class customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //이름

            String name = "";
            while (true) {
                System.out.print("이름 입력: ");
                name = sc.nextLine();

                if (name.equals("종료") || name.equals("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                }
                break;
            }
            //나이
            int age = 0;
            // 2. 나이 입력 및 0~199 유효성 검사 루프
            while (true) {
                System.out.print("나이 입력: ");
                age = sc.nextInt();

                if (age >= 0 && age <= 199) {
                    break;
                } else {
                    System.out.println("올바른 나이가 아닙니다. 다시 입력해주세요.\n");
                }
            }
            //성별
            char gender = ' ';
            String genderName = "";

            while (true) {
                System.out.print("성별 입력: ");
                gender = sc.next().charAt(0);
                sc.nextLine();

                if (gender == 'm' || gender == 'M') {
                    System.out.println("남성");
                    genderName = "남성";
                    break;
                } else if (gender == 'f' || gender == 'F') {
                    System.out.println("여성");
                    genderName = "여성";
                    break;
                } else {
                    System.out.println("올바른 성별이 아닙니다. 다시 입력해주세요.\n");
                }
            }
            //직업
            int jobNum = 0;
            String jobName = "";

            while (true) {
                String jobList = "=====================================\n" +
                        "         직업을 선택해주세요.     \n" +
                        "=====================================\n" +
                        "1. 학생\n" +
                        "2. 회사원\n" +
                        "3. 주부\n" +
                        "4. 무직\n" +
                        "=====================================";
                System.out.println(jobList);
                System.out.print("직업 입력[1~4]: ");
                jobNum = sc.nextInt();
                sc.nextLine(); // 버퍼 정리

                switch (jobNum) {
                    case 1:
                        jobName = "학생";
                        break;
                    case 2:
                        jobName = "회사원";
                        break;
                    case 3:
                        jobName = "주부";
                        break;
                    case 4:
                        jobName = "무직";
                        break;
                    default:
                        System.out.println("올바른 직업이 아닙니다. 다시 선택해주세요.\n");
                        continue;
                }
                break;
            }
            System.out.println("\n");
            System.out.println("=====================================");
            System.out.println("                회원 정보             ");
            System.out.println("1. 이름 : " + name);
            System.out.println("2. 나이 : " + age +'살');
            System.out.println("3. 성별 : " + genderName);
            System.out.println("4. 직업 : " + jobName);
            System.out.println("=====================================\n");
        }
    }
}
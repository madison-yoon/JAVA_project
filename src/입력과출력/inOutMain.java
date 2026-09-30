package 입력과출력;

public class inOutMain { // 자바 클래스 이름은 대문자로 시작해야함
    public static void main(String[] args) {
        // System.in: 표준 입력 스트림
        // System.out: 표준 출력 스트림
        // System.err: 표준 오류 스트림, 거의 사용 되지 않음
        // 이름, 주소, 성별, 국어, 영어, 수학 변수를 만들고 값을 대입
        // 이름, 주소, 성별, 총점, 평균을 println과 printf로 출력
        String name = "Lee";
        String addr = "Seoul City";
        char gender = 'F';
        int kor = 99;
        int eng = 88;
        int mat = 40;
        double aver = 0.0;
        int total = 0;
        total = kor + eng + mat;
        aver = (double) total / 3;

// println() : 자바의 오버로딩 문법을 사용, 데이터 타입을 자동으로 찾아 줌
        System.out.println("======= Java Style output =======");
        System.out.println("Name : " + name);
        System.out.println("Address : " + addr);
        System.out.println("Gender : " + gender);
        System.out.println("Total : " + total);
        System.out.println("Average : " + aver);

// printf() : 서식 지정자를 사용해서 출력 하는 방식
        System.out.println("====== C Style Output =======");
        System.out.printf("Name : %s\n", name);
        System.out.printf("Address : %s\n", addr);
        System.out.printf("Gender : %c\n", gender);
        System.out.printf("Total : %d\n", total);
        System.out.printf("Average : %.2f\n", aver);

    }
}

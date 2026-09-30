package 변수와자료형;

public class DataType {
    public static void main(String[] args) {
        boolean isTrue = true; // 참과 거짓 구분 용도, 1byte
        char gender = 'M';
        // 문자 저장, 자바에서 문자는 '', 문자열 "", 문자는 내부적으로 정수값이 사용됨, 부호없는 2byte
        byte bVar = 120; // 1byte, -128 ~ 127
        short sVar = 30000; //2byte, -32768 ~ 32767
        int iVar = 1000000;    // 4byte, -2147483648 ~ 2147483647
        long lVar = 100000000L;// 8byte, -9223372036854775808 ~ 9223372036854775807
        float fVar = 3.14f;    // 4byte
        double dVar = 3.14;    // 8byte
        String name = "곰돌이"; // 문자열을 저장, 참조 타입

        // 묵시적 형변환 : 컴파일로 자동으로 형변환을 하는 것
        int num = 10;  //4byte
        double d = num;//8byte

        int numb = 10;
        double dNum = 20.13;
        double rst = numb + dNum;
        System.out.println(rst);

        // 명시적 형변환 : 사용자가 의도를 가지고 형변환을 하는 것
        int kor = 66;
        int mat = 33;
        int eng = 77;
        double avg = (kor + mat + eng) / 3; // 정수로 결과값이 나옴 정수끼리 계산하였기 때문
//        double avg = (double) (kor + mat + eng) / 3; // 명시적 형변환과 묵시적 형변환이 함께 일어남
//        double avg = (kor + mat + eng) / 3.0; // 숫자 자체를 실수로 만들어 정수 / 실수 형태로 변환
        System.out.println(avg);
    }
}

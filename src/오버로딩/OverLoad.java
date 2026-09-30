package 오버로딩;

// 메서드의 매게변수와 개수 또는 타입으로 메서드를 구분하는 것
// - 반환값은 영향이 없음

public class OverLoad {
    public static void main(String[] args) {
        System.out.println(add(100, 200));
        System.out.println(add(100, 200,300,500,500,500));
        System.out.println(add(100, 2.53,38.58));
        System.out.println(add("곰돌이","사육사"));
        System.out.println(add(100,"Korea","Seoul"));

    }
    static int add(int a, int b) {
        return a+b;
    }
    static int add(int a, int b, int c) {
        return a+b+c;
    }
    static int add(int ...nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
    static double add(int a, double b, double c) {
        return a+b+c;
    }
    static String add(String a, String b) {
        return a+b;
    }
    static String add(int a, String b, String c) {
        return a+b+c;
    }
}

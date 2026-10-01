package 싱글톤;

// 하나만 생성되어 해당 명칭으로 불림
// 스프링부트의 스프링 컨테이너의 빈 등록이 싱글톤
// 이미 생성된 인스턴스를 활용하기 때문에 속도나 메모리 측면에서 이득
// 코드가 복잡해지며 동시성 문제를 해결하기 위해 synchronized를 사용해야 하는 경우 발생

public class SingleMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setInfo("원이",3000);
        student2.setInfo("리브",2000);

        student1.print();
        student2.print();


    }
}

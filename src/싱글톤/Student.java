package 싱글톤;

public class Student {
    private String name;
    private int id;

    // 생성자를 통해 각 학생마다 고유한 값을 초기화
    public void setInfo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void print() {
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
    }
}
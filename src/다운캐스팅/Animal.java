package 다운캐스팅;

public class Animal {
    public void move() {
        System.out.println("동물이 움직 입니다.");
    }
}

// 추상화로 만드는 방법
//public abstract class Animal {
//    public abstract void move();
//}

// 각 동물들의 고유특성 readbook, hunting 등은 action(원하는 매게변수)를 통일하여 다운캐스팅 없이 활용 가능
//public void readBook < action() {
//    System.out.println("사람이 책을 읽습니다.");
//}
//public void hunting < action() {
//    System.out.println("호랑이가 사냥을 합니다.");
//}

class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("강아지가 네 발로 걷습니다.");
    }
    public void feeding() {
        System.out.println("강아지가 사료를 먹습니다.");
    }
}

class Snake extends Animal {
    @Override
    public void move() {
        System.out.println("뱀이 기어갑니다.");
    }
    public void coiling() {
        System.out.println("뱀이 똬리를 틀고 있습니다.");
    }
}